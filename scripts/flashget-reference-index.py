#!/usr/bin/env python3
"""Build a small index of FlashGet layouts/strings for parity work."""
from __future__ import annotations

import json
import re
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1]
FG = ROOT / "research" / "flashget" / "decompiled"
OUT = ROOT / "research" / "flashget" / "reference" / "index.json"

PARENT_LAYOUT_PREFIXES = (
    "parent_",
    "activity_parent",
    "layout_bottom_navigation",
    "item_bottom_navigation",
)
INSTALLER_LAYOUT_NAMES = ("activity_main.xml", "app_bar.xml")


def list_layouts(base: Path, filter_fn) -> list[str]:
    layout_dir = base / "resources" / "res" / "layout"
    if not layout_dir.is_dir():
        return []
    names = sorted(p.name for p in layout_dir.glob("*.xml") if filter_fn(p.name))
    return names


def extract_tab_strings(strings_xml: Path) -> dict[str, str]:
    if not strings_xml.is_file():
        return {}
    text = strings_xml.read_text(encoding="utf-8", errors="replace")
    out: dict[str, str] = {}
    for key in (
        "Parent_Tabbar_Device_Notice",
        "Parent_Tabbar_Device_Title",
        "Parent_Tabbar_My_Title",
        "Download_Tab_Parent",
        "Download_Tab_Children",
    ):
        m = re.search(
            rf'<string name="{re.escape(key)}">([^<]*)</string>',
            text,
        )
        if m:
            out[key] = m.group(1)
    return out


def main() -> None:
    parent_base = FG / "parent-base"
    installer = FG / "kids-installer"
    strings = parent_base / "resources" / "res" / "values" / "strings.xml"

    index = {
        "parentLayouts": list_layouts(
            parent_base,
            lambda n: n.startswith(PARENT_LAYOUT_PREFIXES) or "parent" in n,
        )[:200],
        "parentLayoutCount": len(list(parent_base.glob("resources/res/layout/*.xml"))),
        "installerLayouts": list_layouts(
            installer,
            lambda n: n in INSTALLER_LAYOUT_NAMES or n.startswith("activity_"),
        ),
        "tabStrings": extract_tab_strings(strings),
        "openParentalMap": {
            "Notice": "app-parent/lib/screens/alerts_tab.dart",
            "Device": "app-parent/lib/screens/devices_tab.dart",
            "Me": "app-parent/lib/screens/me_tab.dart",
            "SetupInstall": "app-parent/lib/screens/setup_wizard_screen.dart",
            "Geofence": "app-parent/lib/screens/location_history_screen.dart",
            "KidsInstaller": "android-installer/",
            "ChildAgent": "android-managed/",
        },
    }
    OUT.parent.mkdir(parents=True, exist_ok=True)
    OUT.write_text(json.dumps(index, indent=2) + "\n", encoding="utf-8")
    print(f"Wrote {OUT}")


if __name__ == "__main__":
    main()
