package com.google.common.base;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: StandardSystemProperty.java */
@d9.c
@o
/* loaded from: classes6.dex */
public enum r0 {
    JAVA_VERSION(ProtectedSandApp.s("\uf341")),
    JAVA_VENDOR(ProtectedSandApp.s("\uf343")),
    JAVA_VENDOR_URL(ProtectedSandApp.s("\uf345")),
    JAVA_HOME(ProtectedSandApp.s("\uf347")),
    JAVA_VM_SPECIFICATION_VERSION(ProtectedSandApp.s("\uf349")),
    JAVA_VM_SPECIFICATION_VENDOR(ProtectedSandApp.s("\uf34b")),
    JAVA_VM_SPECIFICATION_NAME(ProtectedSandApp.s("\uf34d")),
    JAVA_VM_VERSION(ProtectedSandApp.s("\uf34f")),
    JAVA_VM_VENDOR(ProtectedSandApp.s("\uf351")),
    JAVA_VM_NAME(ProtectedSandApp.s("\uf353")),
    JAVA_SPECIFICATION_VERSION(ProtectedSandApp.s("\uf355")),
    JAVA_SPECIFICATION_VENDOR(ProtectedSandApp.s("\uf357")),
    JAVA_SPECIFICATION_NAME(ProtectedSandApp.s("\uf359")),
    JAVA_CLASS_VERSION(ProtectedSandApp.s("\uf35b")),
    JAVA_CLASS_PATH(ProtectedSandApp.s("\uf35d")),
    JAVA_LIBRARY_PATH(ProtectedSandApp.s("\uf35f")),
    JAVA_IO_TMPDIR(ProtectedSandApp.s("\uf361")),
    JAVA_COMPILER(ProtectedSandApp.s("\uf363")),
    JAVA_EXT_DIRS(ProtectedSandApp.s("\uf365")),
    OS_NAME(ProtectedSandApp.s("\uf367")),
    OS_ARCH(ProtectedSandApp.s("\uf369")),
    OS_VERSION(ProtectedSandApp.s("\uf36b")),
    FILE_SEPARATOR(ProtectedSandApp.s("\uf36d")),
    PATH_SEPARATOR(ProtectedSandApp.s("\uf36f")),
    LINE_SEPARATOR(ProtectedSandApp.s("\uf371")),
    USER_NAME(ProtectedSandApp.s("\uf373")),
    USER_HOME(ProtectedSandApp.s("\uf375")),
    USER_DIR(ProtectedSandApp.s("\uf377"));

    private final String key;

    r0(String str) {
        this.key = str;
    }

    public String key() {
        return this.key;
    }

    @Override // java.lang.Enum
    public String toString() {
        String key = key();
        String value = value();
        return h.a(com.google.android.gms.common.internal.b.a(value, com.google.android.gms.common.internal.b.a(key, 1)), key, ProtectedSandApp.s("\uf379"), value);
    }

    @zc.a
    public String value() {
        return System.getProperty(this.key);
    }
}
