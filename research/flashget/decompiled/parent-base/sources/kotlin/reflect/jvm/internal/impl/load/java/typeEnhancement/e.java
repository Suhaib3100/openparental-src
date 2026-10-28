package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.w;

/* compiled from: typeQualifiers.kt */
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    public static final a f76714e = new a();

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final e f76715f = new e(null, null, false, false, 8, null);

    /* renamed from: a, reason: collision with root package name */
    @fg.m
    private final h f76716a;

    /* renamed from: b, reason: collision with root package name */
    @fg.m
    private final f f76717b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f76718c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f76719d;

    /* compiled from: typeQualifiers.kt */
    public static final class a {
        private a() {
        }

        @fg.l
        public final e a() {
            return e.f76715f;
        }

        public a(w wVar) {
        }
    }

    public e(@fg.m h hVar, @fg.m f fVar, boolean z4, boolean z5) {
        this.f76716a = hVar;
        this.f76717b = fVar;
        this.f76718c = z4;
        this.f76719d = z5;
    }

    public final boolean b() {
        return this.f76718c;
    }

    @fg.m
    public final f c() {
        return this.f76717b;
    }

    @fg.m
    public final h d() {
        return this.f76716a;
    }

    public final boolean e() {
        return this.f76719d;
    }

    public /* synthetic */ e(h hVar, f fVar, boolean z4, boolean z5, int i4, w wVar) {
        this(hVar, fVar, z4, (i4 & 8) != 0 ? false : z5);
    }
}
