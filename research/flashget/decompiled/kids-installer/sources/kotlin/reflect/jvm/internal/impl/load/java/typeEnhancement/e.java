package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.w;

/* compiled from: typeQualifiers.kt */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    public static final a f24838e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    private static final e f24839f = new e(null, null, false, false, 8, null);

    /* renamed from: a, reason: collision with root package name */
    @d5.e
    private final h f24840a;

    /* renamed from: b, reason: collision with root package name */
    @d5.e
    private final f f24841b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f24842c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f24843d;

    /* compiled from: typeQualifiers.kt */
    public static final class a {
        private a() {
        }

        @d5.d
        public final e a() {
            return e.f24839f;
        }

        public a(w wVar) {
        }
    }

    public e(@d5.e h hVar, @d5.e f fVar, boolean z5, boolean z6) {
        this.f24840a = hVar;
        this.f24841b = fVar;
        this.f24842c = z5;
        this.f24843d = z6;
    }

    public final boolean b() {
        return this.f24842c;
    }

    @d5.e
    public final f c() {
        return this.f24841b;
    }

    @d5.e
    public final h d() {
        return this.f24840a;
    }

    public final boolean e() {
        return this.f24843d;
    }

    public /* synthetic */ e(h hVar, f fVar, boolean z5, boolean z6, int i5, w wVar) {
        this(hVar, fVar, z5, (i5 & 8) != 0 ? false : z6);
    }
}
