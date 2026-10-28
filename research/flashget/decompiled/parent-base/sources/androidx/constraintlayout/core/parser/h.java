package androidx.constraintlayout.core.parser;

/* compiled from: CLParser.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: d, reason: collision with root package name */
    static boolean f22618d;

    /* renamed from: a, reason: collision with root package name */
    private String f22619a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f22620b = false;

    /* renamed from: c, reason: collision with root package name */
    private int f22621c;

    /* compiled from: CLParser.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22622a;

        static {
            int[] iArr = new int[b.values().length];
            f22622a = iArr;
            try {
                iArr[b.OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22622a[b.ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22622a[b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22622a[b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22622a[b.KEY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22622a[b.TOKEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: CLParser.java */
    enum b {
        UNKNOWN,
        OBJECT,
        ARRAY,
        NUMBER,
        STRING,
        KEY,
        TOKEN
    }

    public h(String str) {
        this.f22619a = str;
    }

    private d a(d dVar, int i4, b bVar, boolean z4, char[] cArr) {
        d l02;
        if (f22618d) {
            System.out.println("CREATE " + bVar + " at " + cArr[i4]);
        }
        switch (a.f22622a[bVar.ordinal()]) {
            case 1:
                l02 = g.l0(cArr);
                i4++;
                break;
            case 2:
                l02 = androidx.constraintlayout.core.parser.a.I(cArr);
                i4++;
                break;
            case 3:
                l02 = i.H(cArr);
                break;
            case 4:
                l02 = f.H(cArr);
                break;
            case 5:
                l02 = e.I(cArr);
                break;
            case 6:
                l02 = j.H(cArr);
                break;
            default:
                l02 = null;
                break;
        }
        if (l02 == null) {
            return null;
        }
        l02.A(this.f22621c);
        if (z4) {
            l02.D(i4);
        }
        if (dVar instanceof c) {
            l02.w((c) dVar);
        }
        return l02;
    }

    private d b(int i4, char c5, d dVar, char[] cArr) throws CLParsingException {
        if (c5 == '\t' || c5 == '\n' || c5 == '\r' || c5 == ' ') {
            return dVar;
        }
        if (c5 == '\"' || c5 == '\'') {
            return dVar instanceof g ? a(dVar, i4, b.KEY, true, cArr) : a(dVar, i4, b.STRING, true, cArr);
        }
        if (c5 == '[') {
            return a(dVar, i4, b.ARRAY, true, cArr);
        }
        if (c5 != ']') {
            if (c5 == '{') {
                return a(dVar, i4, b.OBJECT, true, cArr);
            }
            if (c5 != '}') {
                switch (c5) {
                    case '+':
                    case '-':
                    case '.':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        return a(dVar, i4, b.NUMBER, true, cArr);
                    case ',':
                    case ':':
                        return dVar;
                    case '/':
                        int i5 = i4 + 1;
                        if (i5 >= cArr.length || cArr[i5] != '/') {
                            return dVar;
                        }
                        this.f22620b = true;
                        return dVar;
                    default:
                        if (!(dVar instanceof c) || (dVar instanceof g)) {
                            return a(dVar, i4, b.KEY, true, cArr);
                        }
                        d a5 = a(dVar, i4, b.TOKEN, true, cArr);
                        j jVar = (j) a5;
                        if (jVar.O(c5, i4)) {
                            return a5;
                        }
                        throw new CLParsingException("incorrect token <" + c5 + "> at line " + this.f22621c, jVar);
                }
            }
        }
        dVar.x(i4 - 1);
        d f4 = dVar.f();
        f4.x(i4);
        return f4;
    }

    public static g d(String str) throws CLParsingException {
        return new h(str).c();
    }

    public g c() throws CLParsingException {
        char[] charArray = this.f22619a.toCharArray();
        int length = charArray.length;
        int i4 = 1;
        this.f22621c = 1;
        boolean z4 = false;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                i5 = -1;
                break;
            }
            char c5 = charArray[i5];
            if (c5 == '{') {
                break;
            }
            if (c5 == '\n') {
                this.f22621c++;
            }
            i5++;
        }
        if (i5 == -1) {
            throw new CLParsingException("invalid json content", null);
        }
        g l02 = g.l0(charArray);
        l02.A(this.f22621c);
        l02.D(i5);
        int i6 = i5 + 1;
        d dVar = l02;
        while (i6 < length) {
            char c6 = charArray[i6];
            if (c6 == '\n') {
                this.f22621c += i4;
            }
            if (this.f22620b) {
                if (c6 == '\n') {
                    this.f22620b = z4;
                } else {
                    continue;
                    i6++;
                    i4 = 1;
                    z4 = false;
                }
            }
            if (dVar == null) {
                break;
            }
            if (dVar.r()) {
                dVar = b(i6, c6, dVar, charArray);
            } else if (dVar instanceof g) {
                if (c6 == '}') {
                    dVar.x(i6 - 1);
                } else {
                    dVar = b(i6, c6, dVar, charArray);
                }
            } else if (!(dVar instanceof androidx.constraintlayout.core.parser.a)) {
                boolean z5 = dVar instanceof i;
                if (z5) {
                    long j4 = dVar.f22609c;
                    if (charArray[(int) j4] == c6) {
                        dVar.D(j4 + 1);
                        dVar.x(i6 - 1);
                    }
                } else {
                    if (dVar instanceof j) {
                        j jVar = (j) dVar;
                        if (!jVar.O(c6, i6)) {
                            throw new CLParsingException("parsing incorrect token " + jVar.c() + " at line " + this.f22621c, jVar);
                        }
                    }
                    if ((dVar instanceof e) || z5) {
                        long j5 = dVar.f22609c;
                        char c7 = charArray[(int) j5];
                        if ((c7 == '\'' || c7 == '\"') && c7 == c6) {
                            dVar.D(j5 + 1);
                            dVar.x(i6 - 1);
                        }
                    }
                    if (!dVar.r() && (c6 == '}' || c6 == ']' || c6 == ',' || c6 == ' ' || c6 == '\t' || c6 == '\r' || c6 == '\n' || c6 == ':')) {
                        long j6 = i6 - 1;
                        dVar.x(j6);
                        if (c6 == '}' || c6 == ']') {
                            dVar = dVar.f();
                            dVar.x(j6);
                            if (dVar instanceof e) {
                                dVar = dVar.f();
                                dVar.x(j6);
                            }
                        }
                    }
                }
            } else if (c6 == ']') {
                dVar.x(i6 - 1);
            } else {
                dVar = b(i6, c6, dVar, charArray);
            }
            if (dVar.r() && (!(dVar instanceof e) || ((e) dVar).f22605i.size() > 0)) {
                dVar = dVar.f();
            }
            i6++;
            i4 = 1;
            z4 = false;
        }
        while (dVar != null && !dVar.r()) {
            if (dVar instanceof i) {
                dVar.D(((int) dVar.f22609c) + 1);
            }
            dVar.x(length - 1);
            dVar = dVar.f();
        }
        if (f22618d) {
            System.out.println("Root: " + l02.G());
        }
        return l02;
    }
}
