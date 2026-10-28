#!/usr/bin/env bash
set -euo pipefail
ROOT="$(cd "$(dirname "$0")/.." && pwd)"
REPO="$(cd "$ROOT/../.." && pwd)"
JADX_BIN="${JADX_BIN:-jadx}"
INSTALLER="$ROOT/binaries/flashget-installer.apk"
PARENT_BASE="$ROOT/binaries/parent-base.apk"
OUT="$ROOT/decompiled"

if ! command -v "$JADX_BIN" >/dev/null 2>&1; then
  echo "JADX not found. Set JADX_BIN or install jadx CLI." >&2
  exit 1
fi

for f in "$INSTALLER" "$PARENT_BASE"; do
  if [[ ! -f "$f" ]]; then
    echo "Missing $f — copy APKs into research/flashget/binaries/" >&2
    exit 1
  fi
done

mkdir -p "$OUT"
"$JADX_BIN" -d "$OUT/kids-installer" -j "$(nproc)" "$INSTALLER"
"$JADX_BIN" -d "$OUT/parent-base" -j "$(nproc)" "$PARENT_BASE"
echo "Done. Output: $OUT"
