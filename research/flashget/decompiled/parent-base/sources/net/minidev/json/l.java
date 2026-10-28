package net.minidev.json;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* compiled from: JStylerObj.java */
/* loaded from: classes7.dex */
class l {

    /* renamed from: a, reason: collision with root package name */
    public static final e f81727a = new e();

    /* renamed from: b, reason: collision with root package name */
    public static final f f81728b = new f();

    /* renamed from: c, reason: collision with root package name */
    public static final d f81729c = new d();

    /* renamed from: d, reason: collision with root package name */
    public static final c f81730d = new c();

    /* renamed from: e, reason: collision with root package name */
    public static final b f81731e = new b();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JStylerObj.java */
    static class b implements h {
        private b() {
        }

        @Override // net.minidev.json.l.h
        public void a(String str, Appendable appendable) {
            for (int i4 = 0; i4 < str.length(); i4++) {
                try {
                    char charAt = str.charAt(i4);
                    if (charAt == '\f') {
                        appendable.append(ProtectedSandApp.s("襈\u0001"));
                    } else if (charAt == '\r') {
                        appendable.append(ProtectedSandApp.s("襇\u0001"));
                    } else if (charAt == '\"') {
                        appendable.append(ProtectedSandApp.s("襆\u0001"));
                    } else if (charAt == '/') {
                        appendable.append(ProtectedSandApp.s("襅\u0001"));
                    } else if (charAt != '\\') {
                        switch (charAt) {
                            case '\b':
                                appendable.append(ProtectedSandApp.s("襃\u0001"));
                                break;
                            case '\t':
                                appendable.append(ProtectedSandApp.s("襂\u0001"));
                                break;
                            case '\n':
                                appendable.append(ProtectedSandApp.s("襁\u0001"));
                                break;
                            default:
                                if ((charAt < 0 || charAt > 31) && ((charAt < 127 || charAt > 159) && (charAt < 8192 || charAt > 8447))) {
                                    appendable.append(charAt);
                                    break;
                                } else {
                                    appendable.append(ProtectedSandApp.s("褿\u0001"));
                                    String s4 = ProtectedSandApp.s("襀\u0001");
                                    appendable.append(s4.charAt((charAt >> '\f') & 15));
                                    appendable.append(s4.charAt((charAt >> '\b') & 15));
                                    appendable.append(s4.charAt((charAt >> 4) & 15));
                                    appendable.append(s4.charAt(charAt & 15));
                                    break;
                                }
                                break;
                        }
                    } else {
                        appendable.append(ProtectedSandApp.s("襄\u0001"));
                    }
                } catch (IOException unused) {
                    throw new RuntimeException(ProtectedSandApp.s("襉\u0001"));
                }
            }
        }

        b(a aVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JStylerObj.java */
    static class c implements h {
        private c() {
        }

        @Override // net.minidev.json.l.h
        public void a(String str, Appendable appendable) {
            for (int i4 = 0; i4 < str.length(); i4++) {
                try {
                    char charAt = str.charAt(i4);
                    if (charAt == '\f') {
                        appendable.append(ProtectedSandApp.s("襒\u0001"));
                    } else if (charAt == '\r') {
                        appendable.append(ProtectedSandApp.s("襑\u0001"));
                    } else if (charAt == '\"') {
                        appendable.append(ProtectedSandApp.s("襐\u0001"));
                    } else if (charAt != '\\') {
                        switch (charAt) {
                            case '\b':
                                appendable.append(ProtectedSandApp.s("襎\u0001"));
                                break;
                            case '\t':
                                appendable.append(ProtectedSandApp.s("襍\u0001"));
                                break;
                            case '\n':
                                appendable.append(ProtectedSandApp.s("襌\u0001"));
                                break;
                            default:
                                if ((charAt < 0 || charAt > 31) && ((charAt < 127 || charAt > 159) && (charAt < 8192 || charAt > 8447))) {
                                    appendable.append(charAt);
                                    break;
                                } else {
                                    appendable.append(ProtectedSandApp.s("襊\u0001"));
                                    String s4 = ProtectedSandApp.s("襋\u0001");
                                    appendable.append(s4.charAt((charAt >> '\f') & 15));
                                    appendable.append(s4.charAt((charAt >> '\b') & 15));
                                    appendable.append(s4.charAt((charAt >> 4) & 15));
                                    appendable.append(s4.charAt(charAt & 15));
                                    break;
                                }
                        }
                    } else {
                        appendable.append(ProtectedSandApp.s("襏\u0001"));
                    }
                } catch (IOException unused) {
                    throw new RuntimeException(ProtectedSandApp.s("襓\u0001"));
                }
            }
        }

        c(a aVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JStylerObj.java */
    static class d implements g {
        private d() {
        }

        @Override // net.minidev.json.l.g
        public boolean a(String str) {
            int i4;
            char charAt;
            if (str == null) {
                return false;
            }
            int length = str.length();
            if (length == 0 || str.trim() != str) {
                return true;
            }
            char charAt2 = str.charAt(0);
            if (l.c(charAt2) || l.g(charAt2)) {
                return true;
            }
            for (int i5 = 1; i5 < length; i5++) {
                char charAt3 = str.charAt(i5);
                if (l.e(charAt3) || l.g(charAt3)) {
                    return true;
                }
            }
            if (l.a(str)) {
                return true;
            }
            char charAt4 = str.charAt(0);
            if ((charAt4 >= '0' && charAt4 <= '9') || charAt4 == '-') {
                int i6 = 1;
                while (i6 < str.length() && (charAt4 = str.charAt(i6)) >= '0' && charAt4 <= '9') {
                    i6++;
                }
                if (i6 == str.length()) {
                    return true;
                }
                if (charAt4 == '.') {
                    do {
                        i6++;
                        if (i6 >= str.length() || (charAt4 = str.charAt(i6)) < '0') {
                            break;
                        }
                    } while (charAt4 <= '9');
                }
                if (i6 == str.length()) {
                    return true;
                }
                if (charAt4 != 'E' || charAt4 != 'e' || (i4 = i6 + 1) == str.length()) {
                    return false;
                }
                char charAt5 = str.charAt(i4);
                if (charAt5 == '+' || charAt5 == '-') {
                    if (i4 == str.length()) {
                        return false;
                    }
                    charAt5 = str.charAt(i4);
                }
                if ((charAt5 == '+' || charAt5 == '-') && i4 == str.length()) {
                    return false;
                }
                while (i4 < str.length() && (charAt = str.charAt(i4)) >= '0' && charAt <= '9') {
                    i4++;
                }
                if (i4 == str.length()) {
                    return true;
                }
            }
            return false;
        }

        d(a aVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JStylerObj.java */
    static class e implements g {
        private e() {
        }

        @Override // net.minidev.json.l.g
        public boolean a(String str) {
            if (str == null) {
                return false;
            }
            int length = str.length();
            if (length == 0 || str.trim() != str) {
                return true;
            }
            char charAt = str.charAt(0);
            if ((charAt >= '0' && charAt <= '9') || charAt == '-') {
                return true;
            }
            for (int i4 = 0; i4 < length; i4++) {
                char charAt2 = str.charAt(i4);
                if (l.b(charAt2) || l.c(charAt2) || l.d(charAt2) || l.g(charAt2)) {
                    return true;
                }
            }
            return l.a(str);
        }

        e(a aVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JStylerObj.java */
    static class f implements g {
        private f() {
        }

        @Override // net.minidev.json.l.g
        public boolean a(String str) {
            return true;
        }

        f(a aVar) {
        }
    }

    /* compiled from: JStylerObj.java */
    public interface g {
        boolean a(String str);
    }

    /* compiled from: JStylerObj.java */
    public interface h {
        void a(String str, Appendable appendable);
    }

    l() {
    }

    public static boolean a(String str) {
        if (str.length() < 3) {
            return false;
        }
        char charAt = str.charAt(0);
        if (charAt == 'n') {
            return str.equals(ProtectedSandApp.s("襔\u0001"));
        }
        if (charAt == 't') {
            return str.equals(ProtectedSandApp.s("襕\u0001"));
        }
        if (charAt == 'f') {
            return str.equals(ProtectedSandApp.s("襖\u0001"));
        }
        if (charAt == 'N') {
            return str.equals(ProtectedSandApp.s("襗\u0001"));
        }
        return false;
    }

    public static boolean b(char c5) {
        return c5 == '\r' || c5 == '\n' || c5 == '\t' || c5 == ' ';
    }

    public static boolean c(char c5) {
        return c5 == '{' || c5 == '[' || c5 == ',' || c5 == '}' || c5 == ']' || c5 == ':' || c5 == '\'' || c5 == '\"';
    }

    public static boolean d(char c5) {
        return c5 == '\b' || c5 == '\f' || c5 == '\n';
    }

    public static boolean e(char c5) {
        return c5 == '}' || c5 == ']' || c5 == ',' || c5 == ':';
    }

    public static boolean f(char c5) {
        return c5 == '{' || c5 == '[' || c5 == ',' || c5 == ':';
    }

    public static boolean g(char c5) {
        return (c5 >= 0 && c5 <= 31) || (c5 >= 127 && c5 <= 159) || (c5 >= 8192 && c5 <= 8447);
    }
}
