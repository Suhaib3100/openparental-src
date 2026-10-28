package androidx.compose.ui.graphics.colorspace;

import android.support.v4.media.MediaDescriptionCompat;
import androidx.annotation.e1;
import androidx.compose.ui.graphics.colorspace.b;
import androidx.compose.ui.graphics.colorspace.m;
import androidx.compose.ui.graphics.f2;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: Connector.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u0000 \u00112\u00020\u0001:\u0002\u0017\u0012B;\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB!\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\u000eJ'\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\t2\b\b\u0001\u0010\u0014\u001a\u00020\tH\u0017¢\u0006\u0004\b\u0015\u0010\u0016J5\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\u001d\u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010#\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/h;", "", "Landroidx/compose/ui/graphics/colorspace/c;", "source", "destination", "transformSource", "transformDestination", "Landroidx/compose/ui/graphics/colorspace/m;", "renderIntent", "", "transform", "<init>", "(Landroidx/compose/ui/graphics/colorspace/c;Landroidx/compose/ui/graphics/colorspace/c;Landroidx/compose/ui/graphics/colorspace/c;Landroidx/compose/ui/graphics/colorspace/c;I[FLkotlin/jvm/internal/w;)V", "intent", "(Landroidx/compose/ui/graphics/colorspace/c;Landroidx/compose/ui/graphics/colorspace/c;ILkotlin/jvm/internal/w;)V", "", "r", "g", "b", "(FFF)[F", "v", "h", "([F)[F", "a", "Landroidx/compose/ui/graphics/d2;", "i", "(FFFF)J", "Landroidx/compose/ui/graphics/colorspace/c;", "f", "()Landroidx/compose/ui/graphics/colorspace/c;", "d", "c", "e", "I", "()I", "[F", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nConnector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/Connector\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,341:1\n34#2:342\n41#2:343\n*S KotlinDebug\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/Connector\n*L\n163#1:342\n164#1:343\n*E\n"})
/* loaded from: classes.dex */
public class h {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE;

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private static final h f17714h;

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    private static final h f17715i;

    /* renamed from: j, reason: collision with root package name */
    @fg.l
    private static final h f17716j;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c source;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c destination;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c transformSource;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c transformDestination;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int renderIntent;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final float[] transform;

    /* compiled from: Connector.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/h$a;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/colorspace/c;", "source", "destination", "Landroidx/compose/ui/graphics/colorspace/m;", "intent", "", "b", "(Landroidx/compose/ui/graphics/colorspace/c;Landroidx/compose/ui/graphics/colorspace/c;I)[F", "Landroidx/compose/ui/graphics/colorspace/h;", "f", "(Landroidx/compose/ui/graphics/colorspace/c;)Landroidx/compose/ui/graphics/colorspace/h;", "SrgbIdentity", "Landroidx/compose/ui/graphics/colorspace/h;", "d", "()Landroidx/compose/ui/graphics/colorspace/h;", "SrgbToOklabPerceptual", "e", "OklabToSrgbPerceptual", "c", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.colorspace.h$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: Connector.kt */
        @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J5\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"androidx/compose/ui/graphics/colorspace/h$a$a", "Landroidx/compose/ui/graphics/colorspace/h;", "", "v", "h", "([F)[F", "", "r", "g", "b", "a", "Landroidx/compose/ui/graphics/d2;", "i", "(FFFF)J", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.graphics.colorspace.h$a$a, reason: collision with other inner class name */
        public static final class C0330a extends h {
            C0330a(c cVar, int i4) {
                super(cVar, cVar, i4, null);
            }

            @Override // androidx.compose.ui.graphics.colorspace.h
            @fg.l
            public float[] h(@fg.l float[] v4) {
                return v4;
            }

            @Override // androidx.compose.ui.graphics.colorspace.h
            public long i(float r4, float g4, float b5, float a5) {
                return f2.a(r4, g4, b5, a5, getDestination());
            }
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] b(c source, c destination, int intent) {
            m.INSTANCE.getClass();
            if (!m.h(intent, m.f17751f)) {
                return null;
            }
            long model = source.getModel();
            b.Companion companion = androidx.compose.ui.graphics.colorspace.b.INSTANCE;
            companion.getClass();
            boolean h4 = androidx.compose.ui.graphics.colorspace.b.h(model, androidx.compose.ui.graphics.colorspace.b.f17669c);
            long model2 = destination.getModel();
            companion.getClass();
            boolean h5 = androidx.compose.ui.graphics.colorspace.b.h(model2, androidx.compose.ui.graphics.colorspace.b.f17669c);
            if (h4 && h5) {
                return null;
            }
            if (!h4 && !h5) {
                return null;
            }
            if (!h4) {
                source = destination;
            }
            l0.n(source, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            a0 a0Var = (a0) source;
            float[] g4 = h4 ? a0Var.getWhitePoint().g() : j.f17726a.e();
            float[] g5 = h5 ? a0Var.getWhitePoint().g() : j.f17726a.e();
            return new float[]{g4[0] / g5[0], g4[1] / g5[1], g4[2] / g5[2]};
        }

        @fg.l
        public final h c() {
            return h.f17716j;
        }

        @fg.l
        public final h d() {
            return h.f17714h;
        }

        @fg.l
        public final h e() {
            return h.f17715i;
        }

        @fg.l
        public final h f(@fg.l c source) {
            m.INSTANCE.getClass();
            return new C0330a(source, source, m.f17749d, null);
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: Connector.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0010ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/h$b;", "Landroidx/compose/ui/graphics/colorspace/h;", "Landroidx/compose/ui/graphics/colorspace/a0;", "mSource", "mDestination", "Landroidx/compose/ui/graphics/colorspace/m;", "intent", "<init>", "(Landroidx/compose/ui/graphics/colorspace/a0;Landroidx/compose/ui/graphics/colorspace/a0;ILkotlin/jvm/internal/w;)V", "source", "destination", "", "j", "(Landroidx/compose/ui/graphics/colorspace/a0;Landroidx/compose/ui/graphics/colorspace/a0;I)[F", "v", "h", "([F)[F", "", "r", "g", "b", "a", "Landroidx/compose/ui/graphics/d2;", "i", "(FFFF)J", "k", "Landroidx/compose/ui/graphics/colorspace/a0;", "l", "m", "[F", "mTransform", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends h {

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final a0 mSource;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final a0 mDestination;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final float[] mTransform;

        public /* synthetic */ b(a0 a0Var, a0 a0Var2, int i4, kotlin.jvm.internal.w wVar) {
            this(a0Var, a0Var2, i4);
        }

        private final float[] j(a0 source, a0 destination, int intent) {
            if (d.h(source.getWhitePoint(), destination.getWhitePoint())) {
                return d.m(destination.getInverseTransform(), source.getTransform());
            }
            float[] transform = source.getTransform();
            float[] inverseTransform = destination.getInverseTransform();
            float[] g4 = source.getWhitePoint().g();
            float[] g5 = destination.getWhitePoint().g();
            e0 whitePoint = source.getWhitePoint();
            j jVar = j.f17726a;
            if (!d.h(whitePoint, jVar.d())) {
                a.INSTANCE.getClass();
                float[] transform2 = a.f17645c.getTransform();
                float[] e4 = jVar.e();
                float[] copyOf = Arrays.copyOf(e4, e4.length);
                l0.o(copyOf, "copyOf(this, size)");
                transform = d.m(d.f(transform2, g4, copyOf), source.getTransform());
            }
            if (!d.h(destination.getWhitePoint(), jVar.d())) {
                a.INSTANCE.getClass();
                float[] transform3 = a.f17645c.getTransform();
                float[] e5 = jVar.e();
                float[] copyOf2 = Arrays.copyOf(e5, e5.length);
                l0.o(copyOf2, "copyOf(this, size)");
                inverseTransform = d.l(d.m(d.f(transform3, g5, copyOf2), destination.getTransform()));
            }
            m.INSTANCE.getClass();
            if (m.h(intent, m.f17751f)) {
                transform = d.n(new float[]{g4[0] / g5[0], g4[1] / g5[1], g4[2] / g5[2]}, transform);
            }
            return d.m(inverseTransform, transform);
        }

        @Override // androidx.compose.ui.graphics.colorspace.h
        @fg.l
        public float[] h(@fg.l float[] v4) {
            v4[0] = (float) this.mSource.getEotfFunc().a(v4[0]);
            v4[1] = (float) this.mSource.getEotfFunc().a(v4[1]);
            v4[2] = (float) this.mSource.getEotfFunc().a(v4[2]);
            d.o(this.mTransform, v4);
            v4[0] = (float) this.mDestination.getOetfFunc().a(v4[0]);
            v4[1] = (float) this.mDestination.getOetfFunc().a(v4[1]);
            v4[2] = (float) this.mDestination.getOetfFunc().a(v4[2]);
            return v4;
        }

        @Override // androidx.compose.ui.graphics.colorspace.h
        public long i(float r4, float g4, float b5, float a5) {
            float a6 = (float) this.mSource.getEotfFunc().a(r4);
            float a7 = (float) this.mSource.getEotfFunc().a(g4);
            float a8 = (float) this.mSource.getEotfFunc().a(b5);
            return f2.a((float) this.mDestination.getOetfFunc().a(d.p(this.mTransform, a6, a7, a8)), (float) this.mDestination.getOetfFunc().a(d.q(this.mTransform, a6, a7, a8)), (float) this.mDestination.getOetfFunc().a(d.r(this.mTransform, a6, a7, a8)), a5, this.mDestination);
        }

        private b(a0 a0Var, a0 a0Var2, int i4) {
            super(a0Var, a0Var2, a0Var, a0Var2, i4, null, null);
            this.mSource = a0Var;
            this.mDestination = a0Var2;
            this.mTransform = j(a0Var, a0Var2, i4);
        }
    }

    static {
        Companion companion = new Companion();
        INSTANCE = companion;
        g gVar = g.f17689a;
        f17714h = companion.f(gVar.x());
        a0 x4 = gVar.x();
        c u4 = gVar.u();
        m.Companion companion2 = m.INSTANCE;
        companion2.getClass();
        f17715i = new h(x4, u4, m.f17748c);
        c u5 = gVar.u();
        a0 x5 = gVar.x();
        companion2.getClass();
        f17716j = new h(u5, x5, m.f17748c);
    }

    public /* synthetic */ h(c cVar, c cVar2, int i4, kotlin.jvm.internal.w wVar) {
        this(cVar, cVar2, i4);
    }

    @fg.l
    /* renamed from: d, reason: from getter */
    public final c getDestination() {
        return this.destination;
    }

    /* renamed from: e, reason: from getter */
    public final int getRenderIntent() {
        return this.renderIntent;
    }

    @fg.l
    /* renamed from: f, reason: from getter */
    public final c getSource() {
        return this.source;
    }

    @e1(MediaDescriptionCompat.BT_FOLDER_TYPE_ARTISTS)
    @fg.l
    public final float[] g(float r4, float g4, float b5) {
        return h(new float[]{r4, g4, b5});
    }

    @e1(min = MediaDescriptionCompat.BT_FOLDER_TYPE_ARTISTS)
    @fg.l
    public float[] h(@e1(min = 3) @fg.l float[] v4) {
        float[] m4 = this.transformSource.m(v4);
        float[] fArr = this.transform;
        if (fArr != null) {
            m4[0] = m4[0] * fArr[0];
            m4[1] = m4[1] * fArr[1];
            m4[2] = m4[2] * fArr[2];
        }
        return this.transformDestination.b(m4);
    }

    public long i(float r4, float g4, float b5, float a5) {
        long k4 = this.transformSource.k(r4, g4, b5);
        kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f75283a;
        float intBitsToFloat = Float.intBitsToFloat((int) (k4 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (k4 & 4294967295L));
        float n4 = this.transformSource.n(r4, g4, b5);
        float[] fArr = this.transform;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            n4 *= fArr[2];
        }
        float f4 = intBitsToFloat2;
        float f5 = intBitsToFloat;
        return this.transformDestination.o(f5, f4, n4, a5, this.destination);
    }

    public /* synthetic */ h(c cVar, c cVar2, c cVar3, c cVar4, int i4, float[] fArr, kotlin.jvm.internal.w wVar) {
        this(cVar, cVar2, cVar3, cVar4, i4, fArr);
    }

    private h(c cVar, c cVar2, c cVar3, c cVar4, int i4, float[] fArr) {
        this.source = cVar;
        this.destination = cVar2;
        this.transformSource = cVar3;
        this.transformDestination = cVar4;
        this.renderIntent = i4;
        this.transform = fArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private h(androidx.compose.ui.graphics.colorspace.c r12, androidx.compose.ui.graphics.colorspace.c r13, int r14) {
        /*
            r11 = this;
            long r0 = r12.getModel()
            androidx.compose.ui.graphics.colorspace.b$a r2 = androidx.compose.ui.graphics.colorspace.b.INSTANCE
            r2.getClass()
            long r3 = androidx.compose.ui.graphics.colorspace.b.c()
            boolean r0 = androidx.compose.ui.graphics.colorspace.b.h(r0, r3)
            r1 = 2
            r3 = 0
            if (r0 == 0) goto L21
            androidx.compose.ui.graphics.colorspace.j r0 = androidx.compose.ui.graphics.colorspace.j.f17726a
            androidx.compose.ui.graphics.colorspace.e0 r0 = r0.d()
            androidx.compose.ui.graphics.colorspace.c r0 = androidx.compose.ui.graphics.colorspace.d.e(r12, r0, r3, r1, r3)
            r7 = r0
            goto L22
        L21:
            r7 = r12
        L22:
            long r4 = r13.getModel()
            r2.getClass()
            long r8 = androidx.compose.ui.graphics.colorspace.b.c()
            boolean r0 = androidx.compose.ui.graphics.colorspace.b.h(r4, r8)
            if (r0 == 0) goto L3f
            androidx.compose.ui.graphics.colorspace.j r0 = androidx.compose.ui.graphics.colorspace.j.f17726a
            androidx.compose.ui.graphics.colorspace.e0 r0 = r0.d()
            androidx.compose.ui.graphics.colorspace.c r0 = androidx.compose.ui.graphics.colorspace.d.e(r13, r0, r3, r1, r3)
            r8 = r0
            goto L40
        L3f:
            r8 = r13
        L40:
            androidx.compose.ui.graphics.colorspace.h$a r0 = androidx.compose.ui.graphics.colorspace.h.INSTANCE
            float[] r10 = androidx.compose.ui.graphics.colorspace.h.Companion.a(r0, r12, r13, r14)
            r4 = r11
            r5 = r12
            r6 = r13
            r9 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.h.<init>(androidx.compose.ui.graphics.colorspace.c, androidx.compose.ui.graphics.colorspace.c, int):void");
    }
}
