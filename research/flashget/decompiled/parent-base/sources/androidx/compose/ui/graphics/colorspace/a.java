package androidx.compose.ui.graphics.colorspace;

import kotlin.Metadata;

/* compiled from: Adaptation.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\t\b&\u0018\u0000 \n2\u00020\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/a;", "", "", "transform", "<init>", "([F)V", "a", "[F", "d", "()[F", "b", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final a f17645c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final a f17646d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final a f17647e;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final float[] transform;

    /* compiled from: Adaptation.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/graphics/colorspace/a$a", "Landroidx/compose/ui/graphics/colorspace/a;", "", "toString", "()Ljava/lang/String;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.colorspace.a$a, reason: collision with other inner class name */
    public static final class C0329a extends a {
        C0329a(float[] fArr) {
            super(fArr, null);
        }

        @fg.l
        public String toString() {
            return "Bradford";
        }
    }

    /* compiled from: Adaptation.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/graphics/colorspace/a$b", "Landroidx/compose/ui/graphics/colorspace/a;", "", "toString", "()Ljava/lang/String;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends a {
        b(float[] fArr) {
            super(fArr, null);
        }

        @fg.l
        public String toString() {
            return "Ciecat02";
        }
    }

    /* compiled from: Adaptation.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/graphics/colorspace/a$c", "Landroidx/compose/ui/graphics/colorspace/a;", "", "toString", "()Ljava/lang/String;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends a {
        c(float[] fArr) {
            super(fArr, null);
        }

        @fg.l
        public String toString() {
            return "VonKries";
        }
    }

    /* compiled from: Adaptation.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/a$d;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/colorspace/a;", "Bradford", "Landroidx/compose/ui/graphics/colorspace/a;", "a", "()Landroidx/compose/ui/graphics/colorspace/a;", "VonKries", "c", "Ciecat02", "b", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.colorspace.a$d, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final a a() {
            return a.f17645c;
        }

        @fg.l
        public final a b() {
            return a.f17647e;
        }

        @fg.l
        public final a c() {
            return a.f17646d;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    static {
        kotlin.jvm.internal.w wVar = null;
        f17645c = new C0329a(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f}, wVar);
        f17646d = new c(new float[]{0.40024f, -0.2263f, 0.0f, 0.7076f, 1.16532f, 0.0f, -0.08081f, 0.0457f, 0.91822f}, wVar);
        f17647e = new b(new float[]{0.7328f, -0.7036f, 0.003f, 0.4296f, 1.6975f, 0.0136f, -0.1624f, 0.0061f, 0.9834f}, wVar);
    }

    public /* synthetic */ a(float[] fArr, kotlin.jvm.internal.w wVar) {
        this(fArr);
    }

    @fg.l
    /* renamed from: d, reason: from getter */
    public final float[] getTransform() {
        return this.transform;
    }

    private a(float[] fArr) {
        this.transform = fArr;
    }
}
