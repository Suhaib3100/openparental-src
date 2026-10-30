#!/usr/bin/env bash
# One-shot: build child APK, install via adb, optional DB migration.
# Run on Mac (Conductor sync): bash scripts/mac-autodeploy.sh
set -euo pipefail

REPO_ROOT="$(cd "$(dirname "$0")/.." && pwd)"
ANDROID_DIR="$REPO_ROOT/android-managed"
export ANDROID_HOME="${ANDROID_HOME:-$HOME/Library/Android/sdk}"
export PATH="$ANDROID_HOME/platform-tools:$ANDROID_HOME/cmdline-tools/latest/bin:$PATH"
# Gradle/Android require JDK 17 — Java 25 breaks the build.
export JAVA_HOME="${JAVA_HOME:-$(/usr/libexec/java_home -v 17 2>/dev/null || /usr/libexec/java_home)}"

APK="$ANDROID_DIR/app/build/outputs/apk/debug/app-debug.apk"
BACKEND_URL="${OP_BACKEND_URL:-${NEXT_PUBLIC_SITE_URL:-}}"
# If Vercel Deployment Protection is on: Project → Settings → Deployment Protection → Protection Bypass for Automation
VERCEL_BYPASS="${VERCEL_AUTOMATION_BYPASS_SECRET:-}"
CURL_AUTH=()
if [[ -n "$VERCEL_BYPASS" ]]; then
  CURL_AUTH=(-H "x-vercel-protection-bypass: $VERCEL_BYPASS")
fi

echo "==> Java: $JAVA_HOME"
echo "==> Android SDK: $ANDROID_HOME"

if ! command -v adb >/dev/null; then
  echo "adb not found; install Android platform-tools." >&2
  exit 1
fi

echo "==> Gradle assembleDebug"
(cd "$ANDROID_DIR" && chmod +x gradlew && ./gradlew :app:assembleDebug --no-daemon)

echo "==> Copy APK to web downloads"
mkdir -p "$REPO_ROOT/web/public/downloads"
cp -f "$APK" "$REPO_ROOT/web/public/downloads/openparental-child.apk"

if [[ -n "$BACKEND_URL" && -n "${OP_PARENT_EMAIL:-}" && -n "${OP_PARENT_PASSWORD:-}" && -z "${OP_PAIR_CODE:-}" ]]; then
  echo "==> Fetch pairing code from API"
  TOK=$(curl -sf "${CURL_AUTH[@]}" -X POST "$BACKEND_URL/auth/login" \
    -H 'Content-Type: application/json' \
    -d "{\"email\":\"$OP_PARENT_EMAIL\",\"password\":\"$OP_PARENT_PASSWORD\"}" \
    | python3 -c "import sys,json; print(json.load(sys.stdin).get('accessToken',''))" 2>/dev/null || true)
  if [[ -n "$TOK" ]]; then
    OP_PAIR_CODE=$(curl -sf "${CURL_AUTH[@]}" -X POST "$BACKEND_URL/pairings" \
      -H "Authorization: Bearer $TOK" -H 'Content-Type: application/json' -d '{}' \
      | python3 -c "import sys,json; print(json.load(sys.stdin).get('code',''))" 2>/dev/null || true)
    export OP_PAIR_CODE
    echo "Pair code: $OP_PAIR_CODE"
  else
    echo "Login failed (Vercel deployment protection? set VERCEL_AUTOMATION_BYPASS_SECRET)" >&2
  fi
fi

DEVICES=$(adb devices | awk 'NR>1 && $2==\"device\" {print $1}')
if [[ -z "$DEVICES" ]]; then
  echo "No adb device — APK built at $APK"
  exit 0
fi

for serial in $DEVICES; do
  echo "==> Installing on $serial"
  adb -s "$serial" install -r "$APK" || adb -s "$serial" install -r -d "$APK"
  if [[ -n "$BACKEND_URL" && -n "${OP_PAIR_CODE:-}" ]]; then
    echo "==> Launch auto-pair backend=$BACKEND_URL code=$OP_PAIR_CODE"
    adb -s "$serial" shell am start -n app.monii.managed/.ui.MainActivity \
      --es op_base_url "$BACKEND_URL" \
      --es op_code "$OP_PAIR_CODE"
  elif [[ -n "$BACKEND_URL" ]]; then
    echo "==> Set backend only (create OP_PAIR_CODE or pair in app)"
    adb -s "$serial" shell am start -n app.monii.managed/.ui.MainActivity \
      --es op_base_url "$BACKEND_URL"
  fi
done

if [[ -n "${DATABASE_URL:-}" ]] && command -v psql >/dev/null; then
  echo "==> DB migration (screen frame columns)"
  psql "$DATABASE_URL" -f "$REPO_ROOT/backend/prisma/add-screen-frame-columns.sql" || true
fi

echo "Done."
