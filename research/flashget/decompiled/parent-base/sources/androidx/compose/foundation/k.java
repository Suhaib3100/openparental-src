package androidx.compose.foundation;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.compose.foundation.i;
import androidx.compose.runtime.g3;
import androidx.compose.runtime.t;
import kotlin.Metadata;

/* compiled from: AndroidExternalSurface.android.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0001\u0010\u0002\u001a]\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001aU\u0010\u0018\u001a\u00020\u000e2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/h;", "d", "(Landroidx/compose/runtime/t;I)Landroidx/compose/foundation/h;", "Landroidx/compose/ui/q;", "modifier", "", "isOpaque", "Landroidx/compose/ui/unit/u;", "surfaceSize", "Landroidx/compose/foundation/i;", "zOrder", "isSecure", "Lkotlin/Function1;", "Landroidx/compose/foundation/g;", "Lkotlin/k2;", "Lkotlin/u;", "onInit", "b", "(Landroidx/compose/ui/q;ZJIZLld/l;Landroidx/compose/runtime/t;II)V", "Landroidx/compose/foundation/f;", "c", "(Landroidx/compose/runtime/t;I)Landroidx/compose/foundation/f;", "Landroidx/compose/ui/graphics/y4;", "transform", "a", "(Landroidx/compose/ui/q;ZJ[FLld/l;Landroidx/compose/runtime/t;II)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nAndroidExternalSurface.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidExternalSurface.android.kt\nandroidx/compose/foundation/AndroidExternalSurface_androidKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,480:1\n487#2,4:481\n491#2,2:489\n495#2:495\n487#2,4:509\n491#2,2:517\n495#2:523\n25#3:485\n25#3:496\n25#3:513\n25#3:524\n1116#4,3:486\n1119#4,3:492\n1116#4,6:497\n1116#4,6:503\n1116#4,3:514\n1119#4,3:520\n1116#4,6:525\n487#5:491\n487#5:519\n*S KotlinDebug\n*F\n+ 1 AndroidExternalSurface.android.kt\nandroidx/compose/foundation/AndroidExternalSurface_androidKt\n*L\n191#1:481,4\n191#1:489,2\n191#1:495\n385#1:509,4\n385#1:517,2\n385#1:523\n191#1:485\n192#1:496\n385#1:513\n386#1:524\n191#1:486,3\n191#1:492,3\n192#1:497,6\n300#1:503,6\n385#1:514,3\n385#1:520,3\n386#1:525,6\n191#1:491\n385#1:519\n*E\n"})
/* loaded from: classes.dex */
public final class k {

    /* compiled from: AndroidExternalSurface.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "context", "Landroid/view/TextureView;", "a", "(Landroid/content/Context;)Landroid/view/TextureView;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<Context, TextureView> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.f f4722b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f4723c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.foundation.g, kotlin.k2> f4724d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.foundation.f fVar, long j4, ld.l<? super androidx.compose.foundation.g, kotlin.k2> lVar) {
            super(1);
            this.f4722b = fVar;
            this.f4723c = j4;
            this.f4724d = lVar;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextureView invoke(@fg.l Context context) {
            TextureView textureView = new TextureView(context);
            androidx.compose.foundation.f fVar = this.f4722b;
            long j4 = this.f4723c;
            ld.l<androidx.compose.foundation.g, kotlin.k2> lVar = this.f4724d;
            fVar.l(j4);
            lVar.invoke(fVar);
            textureView.setSurfaceTextureListener(fVar);
            return textureView;
        }
    }

    /* compiled from: AndroidExternalSurface.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/TextureView;", "it", "Lkotlin/k2;", "a", "(Landroid/view/TextureView;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<TextureView, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f4725b = new b(1);

        b() {
            super(1);
        }

        public final void a(@fg.l TextureView textureView) {
        }

        @Override // ld.l
        public kotlin.k2 invoke(TextureView textureView) {
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AndroidExternalSurface.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/TextureView;", "view", "Lkotlin/k2;", "a", "(Landroid/view/TextureView;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nAndroidExternalSurface.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidExternalSurface.android.kt\nandroidx/compose/foundation/AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,480:1\n1#2:481\n*E\n"})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<TextureView, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f4726b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.f f4727c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f4728d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float[] f4729e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j4, androidx.compose.foundation.f fVar, boolean z4, float[] fArr) {
            super(1);
            this.f4726b = j4;
            this.f4727c = fVar;
            this.f4728d = z4;
            this.f4729e = fArr;
        }

        public final void a(@fg.l TextureView textureView) {
            Matrix matrix;
            SurfaceTexture surfaceTexture;
            if (!androidx.compose.foundation.e.a(androidx.compose.ui.unit.u.INSTANCE, this.f4726b) && (surfaceTexture = textureView.getSurfaceTexture()) != null) {
                long j4 = this.f4726b;
                surfaceTexture.setDefaultBufferSize((int) (j4 >> 32), (int) (j4 & 4294967295L));
            }
            this.f4727c.l(this.f4726b);
            textureView.setOpaque(this.f4728d);
            float[] fArr = this.f4729e;
            if (fArr != null) {
                matrix = this.f4727c.getMatrix();
                androidx.compose.ui.graphics.s0.a(matrix, fArr);
            } else {
                matrix = null;
            }
            textureView.setTransform(matrix);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(TextureView textureView) {
            a(textureView);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AndroidExternalSurface.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f4730b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f4731c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f4732d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float[] f4733e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.foundation.g, kotlin.k2> f4734f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f4735g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f4736h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(androidx.compose.ui.q qVar, boolean z4, long j4, float[] fArr, ld.l<? super androidx.compose.foundation.g, kotlin.k2> lVar, int i4, int i5) {
            super(2);
            this.f4730b = qVar;
            this.f4731c = z4;
            this.f4732d = j4;
            this.f4733e = fArr;
            this.f4734f = lVar;
            this.f4735g = i4;
            this.f4736h = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            k.a(this.f4730b, this.f4731c, this.f4732d, this.f4733e, this.f4734f, tVar, g3.b(this.f4735g | 1), this.f4736h);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AndroidExternalSurface.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "context", "Landroid/view/SurfaceView;", "a", "(Landroid/content/Context;)Landroid/view/SurfaceView;"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.l<Context, SurfaceView> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.foundation.g, kotlin.k2> f4737b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.h f4738c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(ld.l<? super androidx.compose.foundation.g, kotlin.k2> lVar, androidx.compose.foundation.h hVar) {
            super(1);
            this.f4737b = lVar;
            this.f4738c = hVar;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SurfaceView invoke(@fg.l Context context) {
            SurfaceView surfaceView = new SurfaceView(context);
            ld.l<androidx.compose.foundation.g, kotlin.k2> lVar = this.f4737b;
            androidx.compose.foundation.h hVar = this.f4738c;
            lVar.invoke(hVar);
            surfaceView.getHolder().addCallback(hVar);
            return surfaceView;
        }
    }

    /* compiled from: AndroidExternalSurface.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/SurfaceView;", "it", "Lkotlin/k2;", "a", "(Landroid/view/SurfaceView;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.l<SurfaceView, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f4739b = new f(1);

        f() {
            super(1);
        }

        public final void a(@fg.l SurfaceView surfaceView) {
        }

        @Override // ld.l
        public kotlin.k2 invoke(SurfaceView surfaceView) {
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AndroidExternalSurface.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/SurfaceView;", "view", "Lkotlin/k2;", "a", "(Landroid/view/SurfaceView;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.jvm.internal.n0 implements ld.l<SurfaceView, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f4740b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f4741c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f4742d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f4743e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(long j4, boolean z4, int i4, boolean z5) {
            super(1);
            this.f4740b = j4;
            this.f4741c = z4;
            this.f4742d = i4;
            this.f4743e = z5;
        }

        public final void a(@fg.l SurfaceView surfaceView) {
            if (androidx.compose.foundation.e.a(androidx.compose.ui.unit.u.INSTANCE, this.f4740b)) {
                surfaceView.getHolder().setSizeFromLayout();
            } else {
                SurfaceHolder holder = surfaceView.getHolder();
                long j4 = this.f4740b;
                holder.setFixedSize((int) (j4 >> 32), (int) (j4 & 4294967295L));
            }
            surfaceView.getHolder().setFormat(this.f4741c ? -1 : -3);
            int i4 = this.f4742d;
            i.Companion companion = i.INSTANCE;
            companion.getClass();
            if (i.g(i4, i.f4666c)) {
                surfaceView.setZOrderOnTop(false);
            } else {
                companion.getClass();
                if (i.g(i4, i.f4667d)) {
                    surfaceView.setZOrderMediaOverlay(true);
                } else {
                    companion.getClass();
                    if (i.g(i4, i.f4668e)) {
                        surfaceView.setZOrderOnTop(true);
                    }
                }
            }
            surfaceView.setSecure(this.f4743e);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(SurfaceView surfaceView) {
            a(surfaceView);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AndroidExternalSurface.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class h extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f4744b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f4745c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f4746d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f4747e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f4748f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.foundation.g, kotlin.k2> f4749g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f4750h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f4751i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(androidx.compose.ui.q qVar, boolean z4, long j4, int i4, boolean z5, ld.l<? super androidx.compose.foundation.g, kotlin.k2> lVar, int i5, int i6) {
            super(2);
            this.f4744b = qVar;
            this.f4745c = z4;
            this.f4746d = j4;
            this.f4747e = i4;
            this.f4748f = z5;
            this.f4749g = lVar;
            this.f4750h = i5;
            this.f4751i = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            k.b(this.f4744b, this.f4745c, this.f4746d, this.f4747e, this.f4748f, this.f4749g, tVar, g3.b(this.f4750h | 1), this.f4751i);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x005f  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@fg.m androidx.compose.ui.q r19, boolean r20, long r21, @fg.m float[] r23, @fg.l ld.l<? super androidx.compose.foundation.g, kotlin.k2> r24, @fg.m androidx.compose.runtime.t r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.k.a(androidx.compose.ui.q, boolean, long, float[], ld.l, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x005f  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@fg.m androidx.compose.ui.q r17, boolean r18, long r19, int r21, boolean r22, @fg.l ld.l<? super androidx.compose.foundation.g, kotlin.k2> r23, @fg.m androidx.compose.runtime.t r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.k.b(androidx.compose.ui.q, boolean, long, int, boolean, ld.l, androidx.compose.runtime.t, int, int):void");
    }

    @androidx.compose.runtime.i
    private static final androidx.compose.foundation.f c(androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1057437053);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1057437053, i4, -1, "androidx.compose.foundation.rememberAndroidEmbeddedExternalSurfaceState (AndroidExternalSurface.android.kt:383)");
        }
        Object a5 = j.a(tVar, 773894976, -492369756);
        t.Companion companion = androidx.compose.runtime.t.INSTANCE;
        if (a5 == companion.a()) {
            a5 = androidx.view.compose.l.a(androidx.compose.runtime.a1.m(kotlin.coroutines.i.f75057b, tVar), tVar);
        }
        tVar.p0();
        kotlinx.coroutines.r0 coroutineScope = ((androidx.compose.runtime.j0) a5).getCoroutineScope();
        tVar.p0();
        tVar.P(-492369756);
        Object Q = tVar.Q();
        if (Q == companion.a()) {
            Q = new androidx.compose.foundation.f(coroutineScope);
            tVar.E(Q);
        }
        tVar.p0();
        androidx.compose.foundation.f fVar = (androidx.compose.foundation.f) Q;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return fVar;
    }

    @androidx.compose.runtime.i
    private static final androidx.compose.foundation.h d(androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-873615933);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-873615933, i4, -1, "androidx.compose.foundation.rememberAndroidExternalSurfaceState (AndroidExternalSurface.android.kt:189)");
        }
        Object a5 = j.a(tVar, 773894976, -492369756);
        t.Companion companion = androidx.compose.runtime.t.INSTANCE;
        if (a5 == companion.a()) {
            a5 = androidx.view.compose.l.a(androidx.compose.runtime.a1.m(kotlin.coroutines.i.f75057b, tVar), tVar);
        }
        tVar.p0();
        kotlinx.coroutines.r0 coroutineScope = ((androidx.compose.runtime.j0) a5).getCoroutineScope();
        tVar.p0();
        tVar.P(-492369756);
        Object Q = tVar.Q();
        if (Q == companion.a()) {
            Q = new androidx.compose.foundation.h(coroutineScope);
            tVar.E(Q);
        }
        tVar.p0();
        androidx.compose.foundation.h hVar = (androidx.compose.foundation.h) Q;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return hVar;
    }
}
