package androidx.compose.ui.graphics;

import kotlin.Metadata;

/* compiled from: GraphicsLayerScope.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b&\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0006R\u0014\u0010!\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0006R\u0014\u0010#\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0006R\u0014\u0010%\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0006R\u0014\u0010'\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0006R\u0014\u0010)\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0006¨\u0006*"}, d2 = {"Landroidx/compose/ui/graphics/l4;", "", "<init>", "()V", "", "b", "I", "ScaleX", "c", "ScaleY", "d", "Alpha", "e", "TranslationX", "f", "TranslationY", "g", "ShadowElevation", "h", "AmbientShadowColor", "i", "SpotShadowColor", "j", "RotationX", "k", "RotationY", "l", "RotationZ", "m", "CameraDistance", "n", "TransformOrigin", "o", "Shape", "p", "Clip", "q", "CompositingStrategy", "r", "RenderEffect", "s", "MatrixAffectingFields", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l4 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final l4 f17908a = new l4();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final int ScaleX = 1;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final int ScaleY = 2;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final int Alpha = 4;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final int TranslationX = 8;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final int TranslationY = 16;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final int ShadowElevation = 32;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final int AmbientShadowColor = 64;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final int SpotShadowColor = 128;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final int RotationX = 256;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final int RotationY = 512;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final int RotationZ = 1024;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public static final int CameraDistance = 2048;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final int TransformOrigin = 4096;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final int Shape = 8192;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final int Clip = 16384;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public static final int CompositingStrategy = 32768;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public static final int RenderEffect = 131072;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public static final int MatrixAffectingFields = 7963;

    /* renamed from: t, reason: collision with root package name */
    public static final int f17927t = 0;

    private l4() {
    }
}
