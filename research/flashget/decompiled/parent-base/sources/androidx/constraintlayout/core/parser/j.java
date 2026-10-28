package androidx.constraintlayout.core.parser;

/* compiled from: CLToken.java */
/* loaded from: classes.dex */
public class j extends d {

    /* renamed from: i, reason: collision with root package name */
    int f22623i;

    /* renamed from: j, reason: collision with root package name */
    b f22624j;

    /* renamed from: k, reason: collision with root package name */
    char[] f22625k;

    /* renamed from: l, reason: collision with root package name */
    char[] f22626l;

    /* renamed from: m, reason: collision with root package name */
    char[] f22627m;

    /* compiled from: CLToken.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22628a;

        static {
            int[] iArr = new int[b.values().length];
            f22628a = iArr;
            try {
                iArr[b.TRUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22628a[b.FALSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22628a[b.NULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22628a[b.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: CLToken.java */
    enum b {
        UNKNOWN,
        TRUE,
        FALSE,
        NULL
    }

    public j(char[] cArr) {
        super(cArr);
        this.f22623i = 0;
        this.f22624j = b.UNKNOWN;
        this.f22625k = "true".toCharArray();
        this.f22626l = "false".toCharArray();
        this.f22627m = "null".toCharArray();
    }

    public static d H(char[] cArr) {
        return new j(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.d
    protected String F(int i4, int i5) {
        StringBuilder sb = new StringBuilder();
        b(sb, i4);
        sb.append(c());
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.parser.d
    protected String G() {
        if (!h.f22618d) {
            return c();
        }
        return "<" + c() + ">";
    }

    public boolean I() throws CLParsingException {
        b bVar = this.f22624j;
        if (bVar == b.TRUE) {
            return true;
        }
        if (bVar == b.FALSE) {
            return false;
        }
        throw new CLParsingException("this token is not a boolean: <" + c() + ">", this);
    }

    public b K() {
        return this.f22624j;
    }

    public boolean L() throws CLParsingException {
        if (this.f22624j == b.NULL) {
            return true;
        }
        throw new CLParsingException("this token is not a null: <" + c() + ">", this);
    }

    public boolean O(char c5, long j4) {
        int i4 = a.f22628a[this.f22624j.ordinal()];
        if (i4 == 1) {
            char[] cArr = this.f22625k;
            int i5 = this.f22623i;
            r2 = cArr[i5] == c5;
            if (r2 && i5 + 1 == cArr.length) {
                x(j4);
            }
        } else if (i4 == 2) {
            char[] cArr2 = this.f22626l;
            int i6 = this.f22623i;
            r2 = cArr2[i6] == c5;
            if (r2 && i6 + 1 == cArr2.length) {
                x(j4);
            }
        } else if (i4 == 3) {
            char[] cArr3 = this.f22627m;
            int i7 = this.f22623i;
            r2 = cArr3[i7] == c5;
            if (r2 && i7 + 1 == cArr3.length) {
                x(j4);
            }
        } else if (i4 == 4) {
            char[] cArr4 = this.f22625k;
            int i10 = this.f22623i;
            if (cArr4[i10] == c5) {
                this.f22624j = b.TRUE;
            } else if (this.f22626l[i10] == c5) {
                this.f22624j = b.FALSE;
            } else if (this.f22627m[i10] == c5) {
                this.f22624j = b.NULL;
            }
            r2 = true;
        }
        this.f22623i++;
        return r2;
    }
}
