package com.google.common.base;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.f;
import java.io.Serializable;
import java.util.Objects;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CaseFormat.java */
@o
@d9.b
/* loaded from: classes6.dex */
public abstract class d {
    private static final /* synthetic */ d[] $VALUES;
    public static final d LOWER_CAMEL;
    public static final d LOWER_HYPHEN = new a(ProtectedSandApp.s("\uf2c5"), 0, new f.m('-'), ProtectedSandApp.s("\uf2c4"));
    public static final d LOWER_UNDERSCORE;
    public static final d UPPER_CAMEL;
    public static final d UPPER_UNDERSCORE;
    private final com.google.common.base.f wordBoundary;
    private final String wordSeparator;

    /* compiled from: CaseFormat.java */
    enum a extends d {
        a(String str, int i4, com.google.common.base.f fVar, String str2) {
            super(str, i4, fVar, str2, null);
        }

        @Override // com.google.common.base.d
        String convert(d dVar, String str) {
            return dVar == d.LOWER_UNDERSCORE ? str.replace('-', '_') : dVar == d.UPPER_UNDERSCORE ? com.google.common.base.c.j(str.replace('-', '_')) : super.convert(dVar, str);
        }

        @Override // com.google.common.base.d
        String normalizeWord(String str) {
            return com.google.common.base.c.g(str);
        }
    }

    /* compiled from: CaseFormat.java */
    private static final class f extends m<String, String> implements Serializable {

        /* renamed from: f, reason: collision with root package name */
        private static final long f54890f = 0;

        /* renamed from: d, reason: collision with root package name */
        private final d f54891d;

        /* renamed from: e, reason: collision with root package name */
        private final d f54892e;

        f(d dVar, d dVar2) {
            dVar.getClass();
            this.f54891d = dVar;
            dVar2.getClass();
            this.f54892e = dVar2;
        }

        @Override // com.google.common.base.m, com.google.common.base.x
        public boolean equals(@zc.a Object obj) {
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f54891d.equals(fVar.f54891d) && this.f54892e.equals(fVar.f54892e);
        }

        public int hashCode() {
            return this.f54891d.hashCode() ^ this.f54892e.hashCode();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.m
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public String h(String str) {
            return this.f54892e.to(this.f54891d, str);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.m
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public String i(String str) {
            return this.f54891d.to(this.f54892e, str);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f54891d);
            String valueOf2 = String.valueOf(this.f54892e);
            return com.google.common.base.e.a(valueOf2.length() + valueOf.length() + 14, valueOf, ProtectedSandApp.s("\uf2cc"), valueOf2, ProtectedSandApp.s("\uf2cd"));
        }
    }

    private static /* synthetic */ d[] $values() {
        return new d[]{LOWER_HYPHEN, LOWER_UNDERSCORE, LOWER_CAMEL, UPPER_CAMEL, UPPER_UNDERSCORE};
    }

    static {
        f.m mVar = new f.m('_');
        String s4 = ProtectedSandApp.s("\uf2c7");
        LOWER_UNDERSCORE = new d(ProtectedSandApp.s("\uf2c6"), 1, mVar, s4) { // from class: com.google.common.base.d.b
            {
                a aVar = null;
            }

            @Override // com.google.common.base.d
            String convert(d dVar, String str) {
                return dVar == d.LOWER_HYPHEN ? str.replace('_', '-') : dVar == d.UPPER_UNDERSCORE ? com.google.common.base.c.j(str) : super.convert(dVar, str);
            }

            @Override // com.google.common.base.d
            String normalizeWord(String str) {
                return com.google.common.base.c.g(str);
            }
        };
        String str = "";
        LOWER_CAMEL = new d(ProtectedSandApp.s("\uf2c8"), 2, new f.k('A', 'Z'), str) { // from class: com.google.common.base.d.c
            {
                a aVar = null;
            }

            @Override // com.google.common.base.d
            String normalizeFirstWord(String str2) {
                return com.google.common.base.c.g(str2);
            }

            @Override // com.google.common.base.d
            String normalizeWord(String str2) {
                return d.firstCharOnlyToUpper(str2);
            }
        };
        UPPER_CAMEL = new d(ProtectedSandApp.s("\uf2c9"), 3, new f.k('A', 'Z'), str) { // from class: com.google.common.base.d.d
            {
                a aVar = null;
            }

            @Override // com.google.common.base.d
            String normalizeWord(String str2) {
                return d.firstCharOnlyToUpper(str2);
            }
        };
        UPPER_UNDERSCORE = new d(ProtectedSandApp.s("\uf2ca"), 4, new f.m('_'), s4) { // from class: com.google.common.base.d.e
            {
                a aVar = null;
            }

            @Override // com.google.common.base.d
            String convert(d dVar, String str2) {
                return dVar == d.LOWER_HYPHEN ? com.google.common.base.c.g(str2.replace('_', '-')) : dVar == d.LOWER_UNDERSCORE ? com.google.common.base.c.g(str2) : super.convert(dVar, str2);
            }

            @Override // com.google.common.base.d
            String normalizeWord(String str2) {
                return com.google.common.base.c.j(str2);
            }
        };
        $VALUES = $values();
    }

    /* synthetic */ d(String str, int i4, com.google.common.base.f fVar, String str2, a aVar) {
        this(str, i4, fVar, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String firstCharOnlyToUpper(String str) {
        if (str.isEmpty()) {
            return str;
        }
        char h4 = com.google.common.base.c.h(str.charAt(0));
        String g4 = com.google.common.base.c.g(str.substring(1));
        StringBuilder sb = new StringBuilder(com.google.android.gms.common.internal.b.a(g4, 1));
        sb.append(h4);
        sb.append(g4);
        return sb.toString();
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    String convert(d dVar, String str) {
        StringBuilder sb = null;
        int i4 = 0;
        int i5 = -1;
        while (true) {
            i5 = this.wordBoundary.o(str, i5 + 1);
            if (i5 == -1) {
                break;
            }
            if (i4 == 0) {
                sb = new StringBuilder((dVar.wordSeparator.length() * 4) + str.length());
                sb.append(dVar.normalizeFirstWord(str.substring(i4, i5)));
            } else {
                Objects.requireNonNull(sb);
                sb.append(dVar.normalizeWord(str.substring(i4, i5)));
            }
            sb.append(dVar.wordSeparator);
            i4 = this.wordSeparator.length() + i5;
        }
        if (i4 == 0) {
            return dVar.normalizeFirstWord(str);
        }
        Objects.requireNonNull(sb);
        sb.append(dVar.normalizeWord(str.substring(i4)));
        return sb.toString();
    }

    public m<String, String> converterTo(d dVar) {
        return new f(this, dVar);
    }

    String normalizeFirstWord(String str) {
        return normalizeWord(str);
    }

    abstract String normalizeWord(String str);

    public final String to(d dVar, String str) {
        dVar.getClass();
        str.getClass();
        return dVar == this ? str : convert(dVar, str);
    }

    private d(String str, int i4, com.google.common.base.f fVar, String str2) {
        this.wordBoundary = fVar;
        this.wordSeparator = str2;
    }
}
