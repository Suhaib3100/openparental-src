package androidx.compose.ui.graphics.colorspace;

import android.support.v4.media.MediaDescriptionCompat;
import androidx.annotation.e1;
import androidx.annotation.g0;
import androidx.compose.ui.graphics.f2;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: ColorSpace.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b&\u0018\u0000 72\u00020\u0001:\u0001$B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ\u0019\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\u0006H&¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\u0006H&¢\u0006\u0004\b\u000f\u0010\u000eJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00132\b\b\u0001\u0010\u0016\u001a\u00020\u0013H'¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\fH\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\fH\u0010¢\u0006\u0004\b\u001f\u0010 J=\u0010'\u001a\u00020&2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u0000H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(J'\u0010$\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\fH\u0007¢\u0006\u0004\b$\u0010\u0015J\u0019\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0016\u001a\u00020\u0013H'¢\u0006\u0004\b\u0012\u0010\u0018J\u000f\u0010)\u001a\u00020\u0002H\u0016¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0006H\u0016¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u00101\u001a\u0004\b2\u0010*R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0012\u00103\u001a\u0004\b\u0011\u00104R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00100R\u0011\u00108\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b5\u00100R\u0014\u0010;\u001a\u00020,8&X¦\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010=\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010:\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006>"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/c;", "", "", "name", "Landroidx/compose/ui/graphics/colorspace/b;", "model", "", "id", "<init>", "(Ljava/lang/String;JILkotlin/jvm/internal/w;)V", "(Ljava/lang/String;JLkotlin/jvm/internal/w;)V", "component", "", "f", "(I)F", "e", "r", "g", "b", "", "l", "(FFF)[F", "v", "m", "([F)[F", "v0", "v1", "v2", "", "k", "(FFF)J", "n", "(FFF)F", "x", "y", "z", "a", "colorSpace", "Landroidx/compose/ui/graphics/d2;", "o", "(FFFFLandroidx/compose/ui/graphics/colorspace/c;)J", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ljava/lang/String;", "h", "J", "()J", "c", "I", "d", "componentCount", "j", "()Z", "isWideGamut", "i", "isSrgb", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nColorSpace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpace\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,799:1\n25#2,3:800\n*S KotlinDebug\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpace\n*L\n290#1:800,3\n*E\n"})
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: e, reason: collision with root package name */
    public static final int f17675e = -1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f17676f = 63;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long model;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int id;

    private c(String str, long j4) {
        this(str, j4, -1);
    }

    @e1(min = MediaDescriptionCompat.BT_FOLDER_TYPE_ARTISTS)
    @fg.l
    public final float[] a(float x4, float y4, float z4) {
        float[] fArr = new float[b.j(this.model)];
        fArr[0] = x4;
        fArr[1] = y4;
        fArr[2] = z4;
        return b(fArr);
    }

    @e1(min = MediaDescriptionCompat.BT_FOLDER_TYPE_ARTISTS)
    @fg.l
    public abstract float[] b(@e1(min = 3) @fg.l float[] v4);

    @g0(from = 1, to = 4)
    public final int c() {
        return b.j(this.model);
    }

    /* renamed from: d, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public abstract float e(@g0(from = 0, to = 3) int component);

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        c cVar = (c) other;
        if (this.id == cVar.id && l0.g(this.name, cVar.name)) {
            return b.h(this.model, cVar.model);
        }
        return false;
    }

    public abstract float f(@g0(from = 0, to = 3) int component);

    /* renamed from: g, reason: from getter */
    public final long getModel() {
        return this.model;
    }

    @fg.l
    /* renamed from: h, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return ((b.k(this.model) + (this.name.hashCode() * 31)) * 31) + this.id;
    }

    public boolean i() {
        return false;
    }

    public abstract boolean j();

    public long k(float v02, float v12, float v22) {
        float[] l4 = l(v02, v12, v22);
        float f4 = l4[0];
        float f5 = l4[1];
        return (Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L);
    }

    @e1(MediaDescriptionCompat.BT_FOLDER_TYPE_ARTISTS)
    @fg.l
    public final float[] l(float r4, float g4, float b5) {
        return m(new float[]{r4, g4, b5});
    }

    @e1(min = MediaDescriptionCompat.BT_FOLDER_TYPE_ARTISTS)
    @fg.l
    public abstract float[] m(@e1(min = 3) @fg.l float[] v4);

    public float n(float v02, float v12, float v22) {
        return l(v02, v12, v22)[2];
    }

    public long o(float x4, float y4, float z4, float a5, @fg.l c colorSpace) {
        float[] a6 = a(x4, y4, z4);
        return f2.a(a6[0], a6[1], a6[2], a5, colorSpace);
    }

    @fg.l
    public String toString() {
        return this.name + " (id=" + this.id + ", model=" + ((Object) b.l(this.model)) + ')';
    }

    public /* synthetic */ c(String str, long j4, int i4, kotlin.jvm.internal.w wVar) {
        this(str, j4, i4);
    }

    public c(String str, long j4, kotlin.jvm.internal.w wVar) {
        this(str, j4, -1);
    }

    private c(String str, long j4, int i4) {
        this.name = str;
        this.model = j4;
        this.id = i4;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i4 < -1 || i4 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }
}
