package com.cby.txliteav.live.impl.tx;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import androidx.annotation.x;
import androidx.collection.n1;
import b4.b;
import com.cby.txliteav.live.k;
import com.cby.txliteav.live.listener.a;
import com.cby.txliteav.live.o;
import com.cby.txliteav.live.r;
import com.cby.txliteav.live.s;
import com.cby.txliteav.live.t;
import com.cby.txliteav.live.u;
import com.cby.txliteav.live.w;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.device.TXDeviceManager;
import com.tencent.live2.V2TXLiveDef;
import com.tencent.live2.V2TXLivePusher;
import com.tencent.live2.V2TXLivePusherObserver;
import com.tencent.live2.impl.V2TXLivePusherImpl;
import com.tencent.rtmp.ui.TXCloudVideoView;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b0;
import kotlin.c0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.text.v;
import kotlin.x0;

/* compiled from: TXLivePusher.kt */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ;\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\tJ\u000f\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\tJ\u0019\u0010\u001b\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\tJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\tJ\u0019\u0010\u001f\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001f\u0010\u001cJ\u0019\u0010 \u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b \u0010\u001cJ3\u0010!\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b!\u0010\"J!\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020#2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\nH\u0016¢\u0006\u0004\b(\u0010)JA\u0010/\u001a\u00020\u00072\b\u0010*\u001a\u0004\u0018\u00010\u00112\b\b\u0001\u0010,\u001a\u00020+2\b\b\u0001\u0010-\u001a\u00020+2\b\b\u0001\u0010.\u001a\u00020+2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b/\u00100J!\u00103\u001a\u00020\u00072\u0006\u00102\u001a\u0002012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b3\u00104J+\u00108\u001a\u00020\u00072\u0006\u00106\u001a\u0002052\b\u00107\u001a\u0004\u0018\u00010\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b8\u00109J1\u0010?\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\n2\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b?\u0010@J!\u0010C\u001a\u00020\u00072\u0006\u0010B\u001a\u00020A2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\bC\u0010DJ!\u0010G\u001a\u00020\u00072\u0006\u0010F\u001a\u00020E2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\bG\u0010HJ!\u0010I\u001a\u00020\u00072\u0006\u0010F\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\bI\u0010JJ\u0019\u0010K\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\bK\u0010\u001cJ\u0019\u0010L\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\bL\u0010\u001cJ\u0019\u0010M\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\bM\u0010\u001cJ\u000f\u0010N\u001a\u00020\nH\u0016¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\nH\u0016¢\u0006\u0004\bP\u0010OJ!\u0010Q\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\bQ\u0010JJ\u000f\u0010R\u001a\u00020+H\u0016¢\u0006\u0004\bR\u0010SJ\u000f\u0010T\u001a\u00020\nH\u0016¢\u0006\u0004\bT\u0010OJ!\u0010V\u001a\u00020\u00072\u0006\u0010U\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\bV\u0010JJ)\u0010X\u001a\u00020\u00072\u0006\u0010,\u001a\u00020W2\u0006\u0010-\u001a\u00020W2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\bX\u0010YJ\u0017\u0010Z\u001a\u00020\n2\u0006\u0010:\u001a\u00020\nH\u0016¢\u0006\u0004\bZ\u0010[J\u0017\u0010^\u001a\u00020\u00072\u0006\u0010]\u001a\u00020\\H\u0016¢\u0006\u0004\b^\u0010_J\u0017\u0010a\u001a\u00020\u00072\u0006\u0010`\u001a\u00020WH\u0016¢\u0006\u0004\ba\u0010bJ#\u0010d\u001a\u00020\u00072\b\b\u0001\u0010c\u001a\u00020+2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\bd\u0010eJ\u0017\u0010h\u001a\u00020\u00072\u0006\u0010g\u001a\u00020fH\u0016¢\u0006\u0004\bh\u0010iJ!\u0010l\u001a\u00020\u00072\u0006\u0010k\u001a\u00020j2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0017¢\u0006\u0004\bl\u0010mJ!\u0010n\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\bn\u0010JJ\u0019\u0010o\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\bo\u0010\u001cJ\u0019\u0010p\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\bp\u0010\u001cJ\u0019\u0010-\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b-\u0010\u001cJ!\u0010q\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\bq\u0010rJ\u0019\u0010s\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\bs\u0010\u001cJ\u000f\u0010t\u001a\u00020\nH\u0016¢\u0006\u0004\bt\u0010OJ\u0017\u0010,\u001a\u00020\u00072\u0006\u0010u\u001a\u00020\u0013H\u0016¢\u0006\u0004\b,\u0010vJ\u0019\u0010y\u001a\u00020\u00072\b\u0010x\u001a\u0004\u0018\u00010wH\u0016¢\u0006\u0004\by\u0010zR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010{R\u001c\u0010\u0080\u0001\u001a\u00020|8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010}\u001a\u0004\b~\u0010\u007fR\u001b\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001b\u0010\u0082\u0001R\u0018\u0010\u0085\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bK\u0010\u0084\u0001R\u001b\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0018\u0010\u008a\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bn\u0010\u0089\u0001R\u0018\u0010\u008b\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bl\u0010\u0089\u0001R\u0018\u0010\u008c\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001a\u0010\u0089\u0001¨\u0006\u008d\u0001"}, d2 = {"Lcom/cby/txliteav/live/impl/tx/e;", "Lcom/cby/txliteav/live/impl/a;", "Lb4/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lkotlin/k2;", "l0", "()V", "", "isSupportContinuousWheat", "k0", "(Landroid/content/Context;Z)V", "Lcom/cby/txliteav/live/d;", "collectionSource", "frontCamera", "Landroid/graphics/Bitmap;", "image", "", "url", "Lcom/cby/txliteav/live/listener/a;", "callback", "O", "(Lcom/cby/txliteav/live/d;ZLandroid/graphics/Bitmap;Ljava/lang/String;Lcom/cby/txliteav/live/listener/a;)V", "a0", "i", "d", "(Lcom/cby/txliteav/live/listener/a;)V", "N", "s", "a", "m", "k", "(Lcom/cby/txliteav/live/d;ZLandroid/graphics/Bitmap;Lcom/cby/txliteav/live/listener/a;)V", "Landroid/view/View;", "view", "b", "(Landroid/view/View;Lcom/cby/txliteav/live/listener/a;)V", "isShow", "showDebugView", "(Z)V", "bitmap", "", "x", "y", "scale", "D", "(Landroid/graphics/Bitmap;FFFLcom/cby/txliteav/live/listener/a;)V", "Lcom/cby/txliteav/live/f;", "quality", "K", "(Lcom/cby/txliteav/live/f;Lcom/cby/txliteav/live/listener/a;)V", "Lcom/cby/txliteav/live/u;", "resolution", "isLandscape", "z", "(Lcom/cby/txliteav/live/u;Ljava/lang/Boolean;Lcom/cby/txliteav/live/listener/a;)V", "enable", "Lcom/cby/txliteav/live/l;", "pixelFormat", "Lcom/cby/txliteav/live/g;", "bufferType", "P", "(ZLcom/cby/txliteav/live/l;Lcom/cby/txliteav/live/g;Lcom/cby/txliteav/live/listener/a;)V", "Lcom/cby/txliteav/live/r;", "rotation", "c", "(Lcom/cby/txliteav/live/r;Lcom/cby/txliteav/live/listener/a;)V", "Lcom/cby/txliteav/live/k;", "mirror", "w", "(Lcom/cby/txliteav/live/k;Lcom/cby/txliteav/live/listener/a;)V", "q", "(ZLcom/cby/txliteav/live/listener/a;)V", "e", "M", "B", "Q", "()Z", "isFrontCamera", "n", "getCameraZoomMaxRatio", "()F", "isAutoFocusEnabled", "enabled", "V", "", "l", "(IILcom/cby/txliteav/live/listener/a;)V", "enableCameraTorch", "(Z)Z", "Lcom/cby/txliteav/live/a;", "route", "U", "(Lcom/cby/txliteav/live/a;)V", "volume", "setVoiceCaptureVolume", "(I)V", "value", "Y", "(FLcom/cby/txliteav/live/listener/a;)V", "Lcom/cby/txliteav/live/c;", "params", "G", "(Lcom/cby/txliteav/live/c;)V", "Lcom/cby/txliteav/live/w;", "type", "h", "(Lcom/cby/txliteav/live/w;Lcom/cby/txliteav/live/listener/a;)V", "g", "C", "E", "p", "(Landroid/graphics/Bitmap;Lcom/cby/txliteav/live/listener/a;)V", "j", "isPushing", "msg", "(Ljava/lang/String;)V", "Lcom/cby/txliteav/live/listener/c;", "listener", "F", "(Lcom/cby/txliteav/live/listener/c;)V", "Landroid/content/Context;", "Lc4/a;", "Lkotlin/b0;", "d0", "()Lc4/a;", "logger", "Lcom/tencent/live2/V2TXLivePusher;", "Lcom/tencent/live2/V2TXLivePusher;", "mLivePusher", "Lcom/cby/txliteav/live/d;", "mCollectionSource", "f", "Landroid/graphics/Bitmap;", "mVirtualCameraImage", "Z", "mPushFlag", "mMicrophoneOpen", "mPushAudioFlag", "TxLiteAV_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nTXLivePusher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TXLivePusher.kt\ncom/cby/txliteav/live/impl/tx/TXLivePusher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,999:1\n1#2:1000\n*E\n"})
/* loaded from: classes3.dex */
public final class e extends com.cby.txliteav.live.impl.a implements b4.b {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final Context context;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final b0 logger;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @m
    private V2TXLivePusher mLivePusher;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private com.cby.txliteav.live.d mCollectionSource;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @m
    private Bitmap mVirtualCameraImage;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean mPushFlag;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean mMicrophoneOpen;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean mPushAudioFlag;

    /* compiled from: TXLivePusher.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46631a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f46632b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f46633c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f46634d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f46635e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f46636f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f46637g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int[] f46638h;

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ int[] f46639i;

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ int[] f46640j;

        static {
            int[] iArr = new int[com.cby.txliteav.live.d.values().length];
            try {
                iArr[com.cby.txliteav.live.d.CAMERA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.cby.txliteav.live.d.SCREEN_CAPTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.cby.txliteav.live.d.IMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.cby.txliteav.live.d.AUDIU_ONLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f46631a = iArr;
            int[] iArr2 = new int[com.cby.txliteav.live.f.values().length];
            try {
                iArr2[com.cby.txliteav.live.f.LiveAudioQualityDefault.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.cby.txliteav.live.f.LiveAudioQualityMusic.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.cby.txliteav.live.f.LiveAudioQualitySpeech.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f46632b = iArr2;
            int[] iArr3 = new int[u.values().length];
            try {
                iArr3[u.LiveVideoResolution480x480.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[u.LiveVideoResolution640x360.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[u.LiveVideoResolution640x480.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[u.LiveVideoResolution960x540.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[u.LiveVideoResolution1280x720.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[u.LiveVideoResolution1920x1080.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            f46633c = iArr3;
            int[] iArr4 = new int[com.cby.txliteav.live.l.values().length];
            try {
                iArr4[com.cby.txliteav.live.l.LivePixelFormatI420.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[com.cby.txliteav.live.l.LivePixelFormatTexture2D.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            f46634d = iArr4;
            int[] iArr5 = new int[com.cby.txliteav.live.g.values().length];
            try {
                iArr5[com.cby.txliteav.live.g.LiveBufferTypeByteBuffer.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr5[com.cby.txliteav.live.g.LiveBufferTypeByteArray.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr5[com.cby.txliteav.live.g.LiveBufferTypeTexture.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            f46635e = iArr5;
            int[] iArr6 = new int[r.values().length];
            try {
                iArr6[r.Rotation0.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr6[r.Rotation90.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr6[r.Rotation180.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr6[r.Rotation270.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            f46636f = iArr6;
            int[] iArr7 = new int[k.values().length];
            try {
                iArr7[k.LiveMirrorTypeAuto.ordinal()] = 1;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr7[k.LiveMirrorTypeEnable.ordinal()] = 2;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr7[k.LiveMirrorTypeDisable.ordinal()] = 3;
            } catch (NoSuchFieldError unused25) {
            }
            f46637g = iArr7;
            int[] iArr8 = new int[com.cby.txliteav.live.a.values().length];
            try {
                iArr8[com.cby.txliteav.live.a.AudioRouteSpeakerphone.ordinal()] = 1;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr8[com.cby.txliteav.live.a.AudioRouteEarpiece.ordinal()] = 2;
            } catch (NoSuchFieldError unused27) {
            }
            f46638h = iArr8;
            int[] iArr9 = new int[com.cby.txliteav.live.b.values().length];
            try {
                iArr9[com.cby.txliteav.live.b.CameraCaptureManual.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr9[com.cby.txliteav.live.b.CameraResolutionStrategyAuto.ordinal()] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr9[com.cby.txliteav.live.b.CameraResolutionStrategyPerformance.ordinal()] = 3;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr9[com.cby.txliteav.live.b.CameraResolutionStrategyHighQuality.ordinal()] = 4;
            } catch (NoSuchFieldError unused31) {
            }
            f46639i = iArr9;
            int[] iArr10 = new int[w.values().length];
            try {
                iArr10[w.SystemVolumeTypeAuto.ordinal()] = 1;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr10[w.SystemVolumeTypeMedia.ordinal()] = 2;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr10[w.SystemVolumeTypeVOIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused34) {
            }
            f46640j = iArr10;
        }
    }

    /* compiled from: TXLivePusher.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lc4/a;", "a", "()Lc4/a;"}, k = 3, mv = {1, 9, 0})
    static final class b extends n0 implements ld.a<c4.a> {
        b() {
            super(0);
        }

        @Override // ld.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c4.a invoke() {
            return new c4.a(e.this.getClass());
        }
    }

    /* compiled from: TXLivePusher.kt */
    @Metadata(d1 = {"\u0000S\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\rJ\u0019\u0010!\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J#\u0010&\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010%\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010\rJ!\u0010)\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\bH\u0016¢\u0006\u0004\b+\u0010\rJ\u0017\u0010-\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u0002H\u0016¢\u0006\u0004\b-\u0010\u0011J!\u0010/\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010.\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b/\u0010*J!\u00102\u001a\u00020\b2\u0006\u00101\u001a\u0002002\b\u0010.\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b2\u00103J!\u00104\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010.\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b4\u0010*¨\u00065"}, d2 = {"com/cby/txliteav/live/impl/tx/e$c", "Lcom/tencent/live2/V2TXLivePusherObserver;", "", "code", "", "msg", "Landroid/os/Bundle;", "extraInfo", "Lkotlin/k2;", "onError", "(ILjava/lang/String;Landroid/os/Bundle;)V", "onWarning", "onCaptureFirstAudioFrame", "()V", "onCaptureFirstVideoFrame", "volume", "onMicrophoneVolumeUpdate", "(I)V", "Lcom/tencent/live2/V2TXLiveDef$V2TXLivePushStatus;", "status", "onPushStatusUpdate", "(Lcom/tencent/live2/V2TXLiveDef$V2TXLivePushStatus;Ljava/lang/String;Landroid/os/Bundle;)V", "Lcom/tencent/live2/V2TXLiveDef$V2TXLivePusherStatistics;", "statistics", "onStatisticsUpdate", "(Lcom/tencent/live2/V2TXLiveDef$V2TXLivePusherStatistics;)V", "Landroid/graphics/Bitmap;", "image", "onSnapshotComplete", "(Landroid/graphics/Bitmap;)V", "onGLContextCreated", "Lcom/tencent/live2/V2TXLiveDef$V2TXLiveAudioFrame;", "frame", "onProcessAudioFrame", "(Lcom/tencent/live2/V2TXLiveDef$V2TXLiveAudioFrame;)V", "Lcom/tencent/live2/V2TXLiveDef$V2TXLiveVideoFrame;", "srcFrame", "dstFrame", "onProcessVideoFrame", "(Lcom/tencent/live2/V2TXLiveDef$V2TXLiveVideoFrame;Lcom/tencent/live2/V2TXLiveDef$V2TXLiveVideoFrame;)I", "onGLContextDestroyed", "onSetMixTranscodingConfig", "(ILjava/lang/String;)V", "onScreenCaptureStarted", "reason", "onScreenCaptureStopped", "storagePath", "onLocalRecordBegin", "", "durationMs", "onLocalRecording", "(JLjava/lang/String;)V", "onLocalRecordComplete", "TxLiteAV_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends V2TXLivePusherObserver {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.cby.txliteav.live.listener.c f46643b;

        /* compiled from: TXLivePusher.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f46644a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f46645b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ int[] f46646c;

            static {
                int[] iArr = new int[V2TXLiveDef.V2TXLivePushStatus.values().length];
                try {
                    iArr[V2TXLiveDef.V2TXLivePushStatus.V2TXLivePushStatusConnecting.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[V2TXLiveDef.V2TXLivePushStatus.V2TXLivePushStatusConnectSuccess.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[V2TXLiveDef.V2TXLivePushStatus.V2TXLivePushStatusReconnecting.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[V2TXLiveDef.V2TXLivePushStatus.V2TXLivePushStatusDisconnected.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f46644a = iArr;
                int[] iArr2 = new int[V2TXLiveDef.V2TXLivePixelFormat.values().length];
                try {
                    iArr2[V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatI420.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatTexture2D.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                f46645b = iArr2;
                int[] iArr3 = new int[V2TXLiveDef.V2TXLiveBufferType.values().length];
                try {
                    iArr3[V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteBuffer.ordinal()] = 1;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr3[V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteArray.ordinal()] = 2;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr3[V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeTexture.ordinal()] = 3;
                } catch (NoSuchFieldError unused9) {
                }
                f46646c = iArr3;
            }
        }

        c(com.cby.txliteav.live.listener.c cVar) {
            this.f46643b = cVar;
        }

        @Override // com.tencent.live2.V2TXLivePusherObserver
        public void onCaptureFirstAudioFrame() {
            super.onCaptureFirstAudioFrame();
            e.this.d0().c(ProtectedSandApp.s("൸"));
            this.f46643b.a();
        }

        @Override // com.tencent.live2.V2TXLivePusherObserver
        public void onCaptureFirstVideoFrame() {
            super.onCaptureFirstVideoFrame();
            e.this.d0().c(ProtectedSandApp.s("൹"));
            this.f46643b.m();
        }

        @Override // com.tencent.live2.V2TXLivePusherObserver
        public void onError(int code, @m String msg, @m Bundle extraInfo) {
            super.onError(code, msg, extraInfo);
            e.this.d0().c(ProtectedSandApp.s("ൺ") + code + ProtectedSandApp.s("ൻ") + msg);
            this.f46643b.l(code, msg, extraInfo);
        }

        @Override // com.tencent.live2.V2TXLivePusherObserver
        public void onGLContextCreated() {
            super.onGLContextCreated();
            e.this.d0().c(ProtectedSandApp.s("ർ"));
            this.f46643b.onGLContextCreated();
        }

        @Override // com.tencent.live2.V2TXLivePusherObserver
        public void onGLContextDestroyed() {
            super.onGLContextDestroyed();
            e.this.d0().c(ProtectedSandApp.s("ൽ"));
            this.f46643b.e();
        }

        @Override // com.tencent.live2.V2TXLivePusherObserver
        public void onLocalRecordBegin(int code, @m String storagePath) {
            super.onLocalRecordBegin(code, storagePath);
            e.this.d0().c(ProtectedSandApp.s("ൾ") + code + ProtectedSandApp.s("ൿ") + storagePath);
            this.f46643b.g(code, storagePath);
        }

        @Override // com.tencent.live2.V2TXLivePusherObserver
        public void onLocalRecordComplete(int code, @m String storagePath) {
            super.onLocalRecordComplete(code, storagePath);
            e.this.d0().c(ProtectedSandApp.s("\u0d80") + code + ProtectedSandApp.s("ൿ") + storagePath);
            this.f46643b.c(code, storagePath);
        }

        @Override // com.tencent.live2.V2TXLivePusherObserver
        public void onLocalRecording(long durationMs, @m String storagePath) {
            super.onLocalRecording(durationMs, storagePath);
            e.this.d0().c(com.cby.txliteav.live.impl.tx.f.a(ProtectedSandApp.s("ඁ"), durationMs, ProtectedSandApp.s("ൿ"), storagePath));
            this.f46643b.h(durationMs, storagePath);
        }

        @Override // com.tencent.live2.V2TXLivePusherObserver
        public void onMicrophoneVolumeUpdate(int volume) {
            super.onMicrophoneVolumeUpdate(volume);
            e.this.d0().c(ProtectedSandApp.s("ං"));
            this.f46643b.n(volume);
        }

        @Override // com.tencent.live2.V2TXLivePusherObserver
        public void onProcessAudioFrame(@m V2TXLiveDef.V2TXLiveAudioFrame frame) {
            super.onProcessAudioFrame(frame);
            e.this.d0().c(ProtectedSandApp.s("ඃ"));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v7, types: [T, com.cby.txliteav.live.t] */
        /* JADX WARN: Type inference failed for: r8v6, types: [T, com.cby.txliteav.live.t] */
        @Override // com.tencent.live2.V2TXLivePusherObserver
        public int onProcessVideoFrame(@m V2TXLiveDef.V2TXLiveVideoFrame srcFrame, @m V2TXLiveDef.V2TXLiveVideoFrame dstFrame) {
            k1.h hVar = new k1.h();
            if (srcFrame != null) {
                V2TXLiveDef.V2TXLivePixelFormat v2TXLivePixelFormat = srcFrame.pixelFormat;
                int i4 = v2TXLivePixelFormat == null ? -1 : a.f46645b[v2TXLivePixelFormat.ordinal()];
                com.cby.txliteav.live.l lVar = i4 != 1 ? i4 != 2 ? com.cby.txliteav.live.l.LivePixelFormatUnknown : com.cby.txliteav.live.l.LivePixelFormatTexture2D : com.cby.txliteav.live.l.LivePixelFormatI420;
                V2TXLiveDef.V2TXLiveBufferType v2TXLiveBufferType = srcFrame.bufferType;
                int i5 = v2TXLiveBufferType == null ? -1 : a.f46646c[v2TXLiveBufferType.ordinal()];
                com.cby.txliteav.live.g gVar = i5 != 1 ? i5 != 2 ? i5 != 3 ? com.cby.txliteav.live.g.LiveBufferTypeUnknown : com.cby.txliteav.live.g.LiveBufferTypeTexture : com.cby.txliteav.live.g.LiveBufferTypeByteArray : com.cby.txliteav.live.g.LiveBufferTypeByteBuffer;
                s sVar = new s();
                sVar.f(srcFrame.texture.textureId);
                sVar.d(srcFrame.texture.eglContext10);
                sVar.e(srcFrame.texture.eglContext14);
                ?? tVar = new t();
                tVar.m(lVar);
                tVar.j(gVar);
                tVar.o(sVar);
                tVar.k(srcFrame.data);
                tVar.i(srcFrame.buffer);
                tVar.p(srcFrame.width);
                tVar.l(srcFrame.height);
                tVar.n(srcFrame.rotation);
                hVar.f75329b = tVar;
            }
            k1.h hVar2 = new k1.h();
            if (dstFrame != null) {
                V2TXLiveDef.V2TXLivePixelFormat v2TXLivePixelFormat2 = dstFrame.pixelFormat;
                int i6 = v2TXLivePixelFormat2 == null ? -1 : a.f46645b[v2TXLivePixelFormat2.ordinal()];
                com.cby.txliteav.live.l lVar2 = i6 != 1 ? i6 != 2 ? com.cby.txliteav.live.l.LivePixelFormatUnknown : com.cby.txliteav.live.l.LivePixelFormatTexture2D : com.cby.txliteav.live.l.LivePixelFormatI420;
                V2TXLiveDef.V2TXLiveBufferType v2TXLiveBufferType2 = dstFrame.bufferType;
                int i7 = v2TXLiveBufferType2 != null ? a.f46646c[v2TXLiveBufferType2.ordinal()] : -1;
                com.cby.txliteav.live.g gVar2 = i7 != 1 ? i7 != 2 ? i7 != 3 ? com.cby.txliteav.live.g.LiveBufferTypeUnknown : com.cby.txliteav.live.g.LiveBufferTypeTexture : com.cby.txliteav.live.g.LiveBufferTypeByteArray : com.cby.txliteav.live.g.LiveBufferTypeByteBuffer;
                s sVar2 = new s();
                sVar2.f(dstFrame.texture.textureId);
                sVar2.d(dstFrame.texture.eglContext10);
                sVar2.e(dstFrame.texture.eglContext14);
                ?? tVar2 = new t();
                tVar2.m(lVar2);
                tVar2.j(gVar2);
                tVar2.o(sVar2);
                tVar2.k(dstFrame.data);
                tVar2.i(dstFrame.buffer);
                tVar2.p(dstFrame.width);
                tVar2.l(dstFrame.height);
                tVar2.n(dstFrame.rotation);
                hVar2.f75329b = tVar2;
            }
            this.f46643b.k((t) hVar.f75329b, (t) hVar2.f75329b);
            return super.onProcessVideoFrame(srcFrame, dstFrame);
        }

        @Override // com.tencent.live2.V2TXLivePusherObserver
        public void onPushStatusUpdate(@m V2TXLiveDef.V2TXLivePushStatus status, @m String msg, @m Bundle extraInfo) {
            super.onPushStatusUpdate(status, msg, extraInfo);
            o oVar = null;
            e.this.d0().c(ProtectedSandApp.s("\u0d84") + (status != null ? status.name() : null) + ProtectedSandApp.s("ൻ") + msg);
            int i4 = status == null ? -1 : a.f46644a[status.ordinal()];
            if (i4 == 1) {
                oVar = o.LivePushStatusConnecting;
            } else if (i4 == 2) {
                oVar = o.LivePushStatusConnectSuccess;
            } else if (i4 == 3) {
                oVar = o.LivePushStatusReconnecting;
            } else if (i4 == 4) {
                oVar = o.LivePushStatusDisconnected;
            }
            this.f46643b.i(oVar, msg, extraInfo);
        }

        @Override // com.tencent.live2.V2TXLivePusherObserver
        public void onScreenCaptureStarted() {
            super.onScreenCaptureStarted();
            e.this.d0().c(ProtectedSandApp.s("අ"));
            this.f46643b.d();
        }

        @Override // com.tencent.live2.V2TXLivePusherObserver
        public void onScreenCaptureStopped(int reason) {
            super.onScreenCaptureStopped(reason);
            e.this.d0().c(ProtectedSandApp.s("ආ") + reason);
            this.f46643b.f(reason);
        }

        @Override // com.tencent.live2.V2TXLivePusherObserver
        public void onSetMixTranscodingConfig(int code, @m String msg) {
            super.onSetMixTranscodingConfig(code, msg);
            e.this.d0().c(ProtectedSandApp.s("ඇ") + code + ProtectedSandApp.s("ൻ") + msg);
            this.f46643b.b(code, msg);
        }

        @Override // com.tencent.live2.V2TXLivePusherObserver
        public void onSnapshotComplete(@m Bitmap image) {
            super.onSnapshotComplete(image);
            e.this.d0().c(ProtectedSandApp.s("ඈ"));
            this.f46643b.onSnapshotComplete(image);
        }

        @Override // com.tencent.live2.V2TXLivePusherObserver
        public void onStatisticsUpdate(@m V2TXLiveDef.V2TXLivePusherStatistics statistics) {
            super.onStatisticsUpdate(statistics);
            if (statistics != null) {
                int i4 = statistics.appCpu;
                int i5 = statistics.systemCpu;
                int i6 = statistics.width;
                int i7 = statistics.height;
                int i10 = statistics.fps;
                int i11 = statistics.audioBitrate;
                int i12 = statistics.videoBitrate;
                StringBuilder a5 = n1.a(ProtectedSandApp.s("ඉ"), i4, ProtectedSandApp.s("ඊ"), i5, ProtectedSandApp.s("උ"));
                androidx.paging.l.a(a5, i6, ProtectedSandApp.s("ඌ"), i7, ProtectedSandApp.s("ඍ"));
                androidx.paging.l.a(a5, i10, ProtectedSandApp.s("ඎ"), i11, ProtectedSandApp.s("ඏ"));
                a5.append(i12);
                a5.append(ProtectedSandApp.s("ඐ"));
                v.p(a5.toString());
            }
        }

        @Override // com.tencent.live2.V2TXLivePusherObserver
        public void onWarning(int code, @m String msg, @m Bundle extraInfo) {
            super.onWarning(code, msg, extraInfo);
            e.this.d0().c(ProtectedSandApp.s("එ") + code + ProtectedSandApp.s("ൻ") + msg);
            this.f46643b.j(code, msg, extraInfo);
        }
    }

    /* compiled from: TXLivePusher.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/cby/txliteav/live/impl/tx/e$d", "Lcom/cby/txliteav/live/listener/a;", "Lkotlin/k2;", "a", "()V", "", "code", "", "msg", "b", "(Ljava/lang/Integer;Ljava/lang/String;)V", "TxLiteAV_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements com.cby.txliteav.live.listener.a {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.cby.txliteav.live.listener.a f46648d;

        d(com.cby.txliteav.live.listener.a aVar) {
            this.f46648d = aVar;
        }

        @Override // com.cby.txliteav.live.listener.a
        public void a() {
            e.this.mMicrophoneOpen = true;
            com.cby.txliteav.live.listener.a aVar = this.f46648d;
            if (aVar != null) {
                aVar.a();
            }
        }

        @Override // com.cby.txliteav.live.listener.a
        public void b(@m Integer code, @m String msg) {
            com.cby.txliteav.live.listener.a aVar = this.f46648d;
            if (aVar != null) {
                if (msg == null) {
                    msg = ProtectedSandApp.s("ඒ");
                }
                aVar.b(code, msg);
            }
        }
    }

    /* compiled from: TXLivePusher.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/cby/txliteav/live/impl/tx/e$e", "Lcom/cby/txliteav/live/listener/a;", "Lkotlin/k2;", "a", "()V", "", "code", "", "msg", "b", "(Ljava/lang/Integer;Ljava/lang/String;)V", "TxLiteAV_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.cby.txliteav.live.impl.tx.e$e, reason: collision with other inner class name */
    public static final class C0764e implements com.cby.txliteav.live.listener.a {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f46650d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.cby.txliteav.live.listener.a f46651e;

        C0764e(String str, com.cby.txliteav.live.listener.a aVar) {
            this.f46650d = str;
            this.f46651e = aVar;
        }

        @Override // com.cby.txliteav.live.listener.a
        public void a() {
            V2TXLivePusher v2TXLivePusher = e.this.mLivePusher;
            Integer valueOf = v2TXLivePusher != null ? Integer.valueOf(v2TXLivePusher.startPush(this.f46650d)) : null;
            if (valueOf != null && valueOf.intValue() == 0) {
                e.this.d0().c(ProtectedSandApp.s("ඓ"));
                e.this.mPushFlag = true;
                com.cby.txliteav.live.listener.a aVar = this.f46651e;
                if (aVar != null) {
                    aVar.a();
                    return;
                }
                return;
            }
            if (valueOf != null && valueOf.intValue() == -5) {
                e.this.d0().c(ProtectedSandApp.s("ඔ"));
                e.this.l0();
                com.cby.txliteav.live.listener.a aVar2 = this.f46651e;
                if (aVar2 != null) {
                    aVar2.b(valueOf, ProtectedSandApp.s("ඕ"));
                    return;
                }
                return;
            }
            if (valueOf != null && valueOf.intValue() == -2) {
                e.this.d0().c(ProtectedSandApp.s("ඖ"));
                e.this.l0();
                com.cby.txliteav.live.listener.a aVar3 = this.f46651e;
                if (aVar3 != null) {
                    aVar3.b(valueOf, ProtectedSandApp.s("\u0d97"));
                    return;
                }
                return;
            }
            if (valueOf != null && valueOf.intValue() == -3) {
                e.this.d0().c(ProtectedSandApp.s("\u0d98"));
                e.this.l0();
                com.cby.txliteav.live.listener.a aVar4 = this.f46651e;
                if (aVar4 != null) {
                    aVar4.b(valueOf, ProtectedSandApp.s("\u0d99"));
                    return;
                }
                return;
            }
            e.this.d0().c(ProtectedSandApp.s("ක"));
            e.this.l0();
            com.cby.txliteav.live.listener.a aVar5 = this.f46651e;
            if (aVar5 != null) {
                a.b.a(aVar5, valueOf, null, 2, null);
            }
        }

        @Override // com.cby.txliteav.live.listener.a
        public void b(@m Integer code, @m String msg) {
            com.cby.txliteav.live.listener.a aVar = this.f46651e;
            if (aVar != null) {
                aVar.b(code, msg);
            }
        }
    }

    /* compiled from: TXLivePusher.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/cby/txliteav/live/impl/tx/e$f", "Lcom/cby/txliteav/live/listener/a;", "Lkotlin/k2;", "a", "()V", "", "code", "", "msg", "b", "(Ljava/lang/Integer;Ljava/lang/String;)V", "TxLiteAV_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements com.cby.txliteav.live.listener.a {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.cby.txliteav.live.listener.a f46653d;

        f(com.cby.txliteav.live.listener.a aVar) {
            this.f46653d = aVar;
        }

        @Override // com.cby.txliteav.live.listener.a
        public void a() {
            e.this.mMicrophoneOpen = false;
            com.cby.txliteav.live.listener.a aVar = this.f46653d;
            if (aVar != null) {
                aVar.a();
            }
        }

        @Override // com.cby.txliteav.live.listener.a
        public void b(@m Integer code, @m String msg) {
            com.cby.txliteav.live.listener.a aVar = this.f46653d;
            if (aVar != null) {
                aVar.b(code, msg);
            }
        }
    }

    /* compiled from: TXLivePusher.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/cby/txliteav/live/impl/tx/e$g", "Lcom/cby/txliteav/live/listener/a;", "Lkotlin/k2;", "a", "()V", "", "code", "", "msg", "b", "(Ljava/lang/Integer;Ljava/lang/String;)V", "TxLiteAV_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g implements com.cby.txliteav.live.listener.a {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.cby.txliteav.live.listener.a f46655d;

        g(com.cby.txliteav.live.listener.a aVar) {
            this.f46655d = aVar;
        }

        @Override // com.cby.txliteav.live.listener.a
        public void a() {
            e.this.mPushFlag = false;
            com.cby.txliteav.live.listener.a aVar = this.f46655d;
            if (aVar != null) {
                aVar.a();
            }
        }

        @Override // com.cby.txliteav.live.listener.a
        public void b(@m Integer code, @m String msg) {
            e.this.mPushFlag = false;
            com.cby.txliteav.live.listener.a aVar = this.f46655d;
            if (aVar != null) {
                aVar.b(code, msg);
            }
        }
    }

    /* compiled from: TXLivePusher.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/cby/txliteav/live/impl/tx/e$h", "Lcom/cby/txliteav/live/listener/a;", "Lkotlin/k2;", "a", "()V", "", "code", "", "msg", "b", "(Ljava/lang/Integer;Ljava/lang/String;)V", "TxLiteAV_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class h implements com.cby.txliteav.live.listener.a {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.cby.txliteav.live.listener.a f46657d;

        h(com.cby.txliteav.live.listener.a aVar) {
            this.f46657d = aVar;
        }

        @Override // com.cby.txliteav.live.listener.a
        public void a() {
            e.this.mCollectionSource = com.cby.txliteav.live.d.AUDIU_ONLY;
            com.cby.txliteav.live.listener.a aVar = this.f46657d;
            if (aVar != null) {
                aVar.a();
            }
        }

        @Override // com.cby.txliteav.live.listener.a
        public void b(@m Integer code, @m String msg) {
            com.cby.txliteav.live.listener.a aVar = this.f46657d;
            if (aVar != null) {
                aVar.b(code, ProtectedSandApp.s("ඛ"));
            }
        }
    }

    public e(@l Context context) {
        l0.p(context, ProtectedSandApp.s("ග"));
        this.context = context;
        this.logger = c0.c(new b());
        this.mCollectionSource = com.cby.txliteav.live.d.NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c4.a d0() {
        return (c4.a) this.logger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l0() {
        V2TXLivePusher v2TXLivePusher;
        V2TXLivePusher v2TXLivePusher2;
        com.cby.txliteav.live.d dVar = this.mCollectionSource;
        int i4 = a.f46631a[dVar.ordinal()];
        if (i4 == 1) {
            V2TXLivePusher v2TXLivePusher3 = this.mLivePusher;
            if (v2TXLivePusher3 != null) {
                v2TXLivePusher3.stopCamera();
            }
        } else if (i4 == 2) {
            V2TXLivePusher v2TXLivePusher4 = this.mLivePusher;
            if (v2TXLivePusher4 != null) {
                v2TXLivePusher4.stopScreenCapture();
            }
        } else if (i4 == 3) {
            V2TXLivePusher v2TXLivePusher5 = this.mLivePusher;
            if (v2TXLivePusher5 != null) {
                v2TXLivePusher5.stopVirtualCamera();
            }
        } else if (i4 == 4 && (v2TXLivePusher2 = this.mLivePusher) != null) {
            v2TXLivePusher2.stopMicrophone();
        }
        if (dVar != com.cby.txliteav.live.d.AUDIU_ONLY && this.mMicrophoneOpen && (v2TXLivePusher = this.mLivePusher) != null) {
            v2TXLivePusher.stopMicrophone();
        }
        this.mCollectionSource = com.cby.txliteav.live.d.NONE;
        this.mMicrophoneOpen = false;
        this.mPushAudioFlag = false;
    }

    @Override // b4.b
    public void B(@m com.cby.txliteav.live.listener.a callback) {
        d0().c(ProtectedSandApp.s("ඝ"));
        V2TXLivePusher v2TXLivePusher = this.mLivePusher;
        b0(v2TXLivePusher != null ? Integer.valueOf(v2TXLivePusher.stopMicrophone()) : null, new f(callback));
    }

    @Override // b4.b
    public void C(@m com.cby.txliteav.live.listener.a callback) {
        V2TXLivePusher v2TXLivePusher = this.mLivePusher;
        b0(v2TXLivePusher != null ? Integer.valueOf(v2TXLivePusher.stopCamera()) : null, callback);
    }

    @Override // b4.b
    public void D(@m Bitmap bitmap, @x(from = 0.0d, to = 1.0d) float x4, @x(from = 0.0d, to = 1.0d) float y4, @x(from = 0.0d, to = 1.0d) float scale, @m com.cby.txliteav.live.listener.a callback) {
        V2TXLivePusher v2TXLivePusher = this.mLivePusher;
        b0(v2TXLivePusher != null ? Integer.valueOf(v2TXLivePusher.setWatermark(bitmap, x4, y4, scale)) : null, callback);
    }

    @Override // b4.b
    public void E(@m com.cby.txliteav.live.listener.a callback) {
        V2TXLivePusher v2TXLivePusher = this.mLivePusher;
        Integer valueOf = v2TXLivePusher != null ? Integer.valueOf(v2TXLivePusher.startScreenCapture()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.mCollectionSource = com.cby.txliteav.live.d.SCREEN_CAPTURE;
            d0().c(ProtectedSandApp.s("ඞ"));
            if (callback != null) {
                callback.a();
                return;
            }
            return;
        }
        d0().c(ProtectedSandApp.s("ඟ") + valueOf);
        if (callback != null) {
            callback.b(valueOf, ProtectedSandApp.s("ච"));
        }
    }

    @Override // b4.b
    public void F(@m com.cby.txliteav.live.listener.c listener) {
        if (listener == null) {
            V2TXLivePusher v2TXLivePusher = this.mLivePusher;
            if (v2TXLivePusher != null) {
                v2TXLivePusher.setObserver(null);
                return;
            }
            return;
        }
        V2TXLivePusher v2TXLivePusher2 = this.mLivePusher;
        if (v2TXLivePusher2 != null) {
            v2TXLivePusher2.setObserver(new c(listener));
        }
    }

    @Override // b4.b
    public void G(@l com.cby.txliteav.live.c params) {
        TXDeviceManager deviceManager;
        l0.p(params, ProtectedSandApp.s("ඡ"));
        TXDeviceManager.TXCameraCaptureParam tXCameraCaptureParam = new TXDeviceManager.TXCameraCaptureParam();
        com.cby.txliteav.live.b g4 = params.g();
        int i4 = g4 == null ? -1 : a.f46639i[g4.ordinal()];
        tXCameraCaptureParam.mode = i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? TXDeviceManager.TXCameraCaptureMode.TXCameraResolutionStrategyAuto : TXDeviceManager.TXCameraCaptureMode.TXCameraResolutionStrategyHighQuality : TXDeviceManager.TXCameraCaptureMode.TXCameraResolutionStrategyPerformance : TXDeviceManager.TXCameraCaptureMode.TXCameraResolutionStrategyAuto : TXDeviceManager.TXCameraCaptureMode.TXCameraCaptureManual;
        tXCameraCaptureParam.width = params.h();
        tXCameraCaptureParam.height = params.f();
        V2TXLivePusher v2TXLivePusher = this.mLivePusher;
        if (v2TXLivePusher == null || (deviceManager = v2TXLivePusher.getDeviceManager()) == null) {
            return;
        }
        deviceManager.setCameraCapturerParam(tXCameraCaptureParam);
    }

    @Override // b4.b
    public void K(@l com.cby.txliteav.live.f quality, @m com.cby.txliteav.live.listener.a callback) {
        V2TXLiveDef.V2TXLiveAudioQuality v2TXLiveAudioQuality;
        l0.p(quality, ProtectedSandApp.s("ජ"));
        int i4 = a.f46632b[quality.ordinal()];
        if (i4 == 1) {
            v2TXLiveAudioQuality = V2TXLiveDef.V2TXLiveAudioQuality.V2TXLiveAudioQualityDefault;
        } else if (i4 == 2) {
            v2TXLiveAudioQuality = V2TXLiveDef.V2TXLiveAudioQuality.V2TXLiveAudioQualityMusic;
        } else {
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            v2TXLiveAudioQuality = V2TXLiveDef.V2TXLiveAudioQuality.V2TXLiveAudioQualitySpeech;
        }
        V2TXLivePusher v2TXLivePusher = this.mLivePusher;
        b0(v2TXLivePusher != null ? Integer.valueOf(v2TXLivePusher.setAudioQuality(v2TXLiveAudioQuality)) : null, callback);
    }

    @Override // b4.b
    public void M(@m com.cby.txliteav.live.listener.a callback) {
        d0().c(ProtectedSandApp.s("ඣ"));
        V2TXLivePusher v2TXLivePusher = this.mLivePusher;
        b0(v2TXLivePusher != null ? Integer.valueOf(v2TXLivePusher.startMicrophone()) : null, new d(callback));
    }

    @Override // b4.b
    public void N() {
        d0().c(ProtectedSandApp.s("ඤ"));
        s();
        b.a.c(this, null, 1, null);
    }

    @Override // b4.b
    public void O(@l com.cby.txliteav.live.d collectionSource, boolean frontCamera, @m Bitmap image, @l String url, @m com.cby.txliteav.live.listener.a callback) {
        l0.p(collectionSource, ProtectedSandApp.s("ඥ"));
        l0.p(url, ProtectedSandApp.s("ඦ"));
        d0().c(ProtectedSandApp.s("ට") + collectionSource + ProtectedSandApp.s("ඨ") + url);
        k(collectionSource, frontCamera, image, new C0764e(url, callback));
    }

    @Override // b4.b
    public void P(boolean enable, @l com.cby.txliteav.live.l pixelFormat, @l com.cby.txliteav.live.g bufferType, @m com.cby.txliteav.live.listener.a callback) {
        l0.p(pixelFormat, ProtectedSandApp.s("ඩ"));
        l0.p(bufferType, ProtectedSandApp.s("ඪ"));
        int i4 = a.f46634d[pixelFormat.ordinal()];
        V2TXLiveDef.V2TXLivePixelFormat v2TXLivePixelFormat = i4 != 1 ? i4 != 2 ? V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatUnknown : V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatTexture2D : V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatI420;
        int i5 = a.f46635e[bufferType.ordinal()];
        V2TXLiveDef.V2TXLiveBufferType v2TXLiveBufferType = i5 != 1 ? i5 != 2 ? i5 != 3 ? V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeUnknown : V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeTexture : V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteArray : V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteBuffer;
        V2TXLivePusher v2TXLivePusher = this.mLivePusher;
        Integer valueOf = v2TXLivePusher != null ? Integer.valueOf(v2TXLivePusher.enableCustomVideoProcess(enable, v2TXLivePixelFormat, v2TXLiveBufferType)) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            d0().c(ProtectedSandApp.s("ණ"));
            if (callback != null) {
                callback.a();
                return;
            }
            return;
        }
        if (valueOf != null && valueOf.intValue() == -4) {
            d0().c(ProtectedSandApp.s("ඬ"));
            if (callback != null) {
                callback.b(valueOf, ProtectedSandApp.s("ත"));
                return;
            }
            return;
        }
        d0().c(ProtectedSandApp.s("ථ") + valueOf);
        if (callback != null) {
            a.b.a(callback, valueOf, null, 2, null);
        }
    }

    @Override // b4.b
    public boolean Q() {
        return isPushing() && this.mMicrophoneOpen && this.mPushAudioFlag;
    }

    @Override // b4.b
    public void U(@l com.cby.txliteav.live.a route) {
        TXDeviceManager.TXAudioRoute tXAudioRoute;
        TXDeviceManager deviceManager;
        l0.p(route, ProtectedSandApp.s("ද"));
        int i4 = a.f46638h[route.ordinal()];
        if (i4 == 1) {
            tXAudioRoute = TXDeviceManager.TXAudioRoute.TXAudioRouteSpeakerphone;
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            tXAudioRoute = TXDeviceManager.TXAudioRoute.TXAudioRouteEarpiece;
        }
        V2TXLivePusher v2TXLivePusher = this.mLivePusher;
        if (v2TXLivePusher == null || (deviceManager = v2TXLivePusher.getDeviceManager()) == null) {
            return;
        }
        deviceManager.setAudioRoute(tXAudioRoute);
    }

    @Override // b4.b
    public void V(boolean enabled, @m com.cby.txliteav.live.listener.a callback) {
        TXDeviceManager deviceManager;
        d0().c(ProtectedSandApp.s("ධ"));
        V2TXLivePusher v2TXLivePusher = this.mLivePusher;
        b0((v2TXLivePusher == null || (deviceManager = v2TXLivePusher.getDeviceManager()) == null) ? null : Integer.valueOf(deviceManager.enableCameraAutoFocus(enabled)), callback);
    }

    @Override // b4.b
    public void Y(@x(from = -1.0d, to = 1.0d) float value, @m com.cby.txliteav.live.listener.a callback) {
        TXDeviceManager deviceManager;
        V2TXLivePusher v2TXLivePusher = this.mLivePusher;
        b0((v2TXLivePusher == null || (deviceManager = v2TXLivePusher.getDeviceManager()) == null) ? null : Integer.valueOf(deviceManager.setExposureCompensation(value)), callback);
    }

    @Override // b4.b
    public void a(@m com.cby.txliteav.live.listener.a callback) {
        d0().c(ProtectedSandApp.s("න"));
        V2TXLivePusher v2TXLivePusher = this.mLivePusher;
        Integer valueOf = v2TXLivePusher != null ? Integer.valueOf(v2TXLivePusher.pauseVideo()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.mPushFlag = false;
        }
        b0(valueOf, callback);
    }

    @Override // b4.b
    public void a0() {
        d0().c(ProtectedSandApp.s("\u0db2"));
        b.a.d(this, null, 1, null);
        i();
    }

    @Override // b4.b
    public void b(@l View view, @m com.cby.txliteav.live.listener.a callback) {
        l0.p(view, ProtectedSandApp.s("ඳ"));
        d0().c(ProtectedSandApp.s("ප"));
        if (view instanceof SurfaceView) {
            V2TXLivePusher v2TXLivePusher = this.mLivePusher;
            b0(v2TXLivePusher != null ? Integer.valueOf(v2TXLivePusher.setRenderView((SurfaceView) view)) : null, callback);
        } else if (view instanceof TextureView) {
            V2TXLivePusher v2TXLivePusher2 = this.mLivePusher;
            b0(v2TXLivePusher2 != null ? Integer.valueOf(v2TXLivePusher2.setRenderView((TextureView) view)) : null, callback);
        } else if (view instanceof TXCloudVideoView) {
            V2TXLivePusher v2TXLivePusher3 = this.mLivePusher;
            b0(v2TXLivePusher3 != null ? Integer.valueOf(v2TXLivePusher3.setRenderView((TXCloudVideoView) view)) : null, callback);
        }
    }

    @Override // b4.b
    public void c(@l r rotation, @m com.cby.txliteav.live.listener.a callback) {
        V2TXLiveDef.V2TXLiveRotation v2TXLiveRotation;
        l0.p(rotation, ProtectedSandApp.s("ඵ"));
        int i4 = a.f46636f[rotation.ordinal()];
        if (i4 == 1) {
            v2TXLiveRotation = V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation0;
        } else if (i4 == 2) {
            v2TXLiveRotation = V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation90;
        } else if (i4 == 3) {
            v2TXLiveRotation = V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation180;
        } else {
            if (i4 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            v2TXLiveRotation = V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation270;
        }
        V2TXLivePusher v2TXLivePusher = this.mLivePusher;
        b0(v2TXLivePusher != null ? Integer.valueOf(v2TXLivePusher.setRenderRotation(v2TXLiveRotation)) : null, callback);
    }

    @Override // b4.b
    public void d(@m com.cby.txliteav.live.listener.a callback) {
        d0().c(ProtectedSandApp.s("බ"));
        V2TXLivePusher v2TXLivePusher = this.mLivePusher;
        Integer valueOf = v2TXLivePusher != null ? Integer.valueOf(v2TXLivePusher.resumeVideo()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.mPushFlag = true;
        }
        b0(valueOf, callback);
    }

    @Override // b4.b
    public void e(@m com.cby.txliteav.live.listener.a callback) {
        d0().c(ProtectedSandApp.s("භ"));
        V2TXLivePusher v2TXLivePusher = this.mLivePusher;
        Integer valueOf = v2TXLivePusher != null ? Integer.valueOf(v2TXLivePusher.snapshot()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            d0().c(ProtectedSandApp.s("ම"));
            if (callback != null) {
                callback.a();
                return;
            }
            return;
        }
        if (valueOf != null && valueOf.intValue() == -3) {
            d0().c(ProtectedSandApp.s("ඹ"));
            if (callback != null) {
                callback.b(valueOf, ProtectedSandApp.s("ය"));
                return;
            }
            return;
        }
        d0().c(ProtectedSandApp.s("ර") + valueOf);
        if (callback != null) {
            callback.b(valueOf, ProtectedSandApp.s("\u0dbc") + valueOf);
        }
    }

    @Override // b4.b
    public boolean enableCameraTorch(boolean enable) {
        TXDeviceManager deviceManager;
        d0().c(ProtectedSandApp.s("ල"));
        V2TXLivePusher v2TXLivePusher = this.mLivePusher;
        return (v2TXLivePusher == null || (deviceManager = v2TXLivePusher.getDeviceManager()) == null || !deviceManager.enableCameraTorch(enable)) ? false : true;
    }

    @Override // b4.b
    public void g(boolean frontCamera, @m com.cby.txliteav.live.listener.a callback) {
        V2TXLivePusher v2TXLivePusher = this.mLivePusher;
        Integer valueOf = v2TXLivePusher != null ? Integer.valueOf(v2TXLivePusher.startCamera(frontCamera)) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.mCollectionSource = com.cby.txliteav.live.d.CAMERA;
            d0().c(ProtectedSandApp.s("\u0dbe"));
            if (callback != null) {
                callback.a();
                return;
            }
            return;
        }
        d0().c(ProtectedSandApp.s("\u0dbf") + valueOf);
        if (callback != null) {
            callback.b(valueOf, ProtectedSandApp.s("ව"));
        }
    }

    @Override // b4.b
    public float getCameraZoomMaxRatio() {
        TXDeviceManager deviceManager;
        V2TXLivePusher v2TXLivePusher = this.mLivePusher;
        if (v2TXLivePusher == null || (deviceManager = v2TXLivePusher.getDeviceManager()) == null) {
            return 0.0f;
        }
        return deviceManager.getCameraZoomMaxRatio();
    }

    @Override // b4.b
    @kotlin.k(message = "v9.5 版本开始不推荐使用。", replaceWith = @x0(expression = "TRTCCloud$startLocalAudio()", imports = {"quality"}))
    public void h(@l w type, @m com.cby.txliteav.live.listener.a callback) {
        TXDeviceManager.TXSystemVolumeType tXSystemVolumeType;
        TXDeviceManager deviceManager;
        l0.p(type, ProtectedSandApp.s("ශ"));
        d0().c(ProtectedSandApp.s("ෂ"));
        int i4 = a.f46640j[type.ordinal()];
        if (i4 == 1) {
            tXSystemVolumeType = TXDeviceManager.TXSystemVolumeType.TXSystemVolumeTypeAuto;
        } else if (i4 == 2) {
            tXSystemVolumeType = TXDeviceManager.TXSystemVolumeType.TXSystemVolumeTypeMedia;
        } else {
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            tXSystemVolumeType = TXDeviceManager.TXSystemVolumeType.TXSystemVolumeTypeVOIP;
        }
        V2TXLivePusher v2TXLivePusher = this.mLivePusher;
        b0((v2TXLivePusher == null || (deviceManager = v2TXLivePusher.getDeviceManager()) == null) ? null : Integer.valueOf(deviceManager.setSystemVolumeType(tXSystemVolumeType)), callback);
    }

    @Override // b4.b
    public void i() {
        d0().c(ProtectedSandApp.s("ස"));
        if (isPushing() && this.mMicrophoneOpen) {
            V2TXLivePusher v2TXLivePusher = this.mLivePusher;
            boolean z4 = false;
            if (v2TXLivePusher != null && v2TXLivePusher.resumeAudio() == 0) {
                z4 = true;
            }
            this.mPushAudioFlag = z4;
        }
    }

    @Override // b4.b
    public boolean isAutoFocusEnabled() {
        TXDeviceManager deviceManager;
        V2TXLivePusher v2TXLivePusher = this.mLivePusher;
        return (v2TXLivePusher == null || (deviceManager = v2TXLivePusher.getDeviceManager()) == null || !deviceManager.isAutoFocusEnabled()) ? false : true;
    }

    @Override // b4.b
    public boolean isFrontCamera() {
        TXDeviceManager deviceManager;
        V2TXLivePusher v2TXLivePusher = this.mLivePusher;
        return (v2TXLivePusher == null || (deviceManager = v2TXLivePusher.getDeviceManager()) == null || !deviceManager.isFrontCamera()) ? false : true;
    }

    @Override // b4.b
    public boolean isPushing() {
        return this.mPushFlag && this.mLivePusher != null;
    }

    @Override // b4.b
    public void j(@m com.cby.txliteav.live.listener.a callback) {
        V2TXLivePusher v2TXLivePusher = this.mLivePusher;
        b0(v2TXLivePusher != null ? Integer.valueOf(v2TXLivePusher.stopVirtualCamera()) : null, callback);
    }

    @Override // b4.b
    public void k(@l com.cby.txliteav.live.d collectionSource, boolean frontCamera, @m Bitmap image, @m com.cby.txliteav.live.listener.a callback) {
        l0.p(collectionSource, ProtectedSandApp.s("ඥ"));
        l0();
        int i4 = a.f46631a[collectionSource.ordinal()];
        if (i4 == 1) {
            g(frontCamera, callback);
            return;
        }
        if (i4 == 2) {
            E(callback);
            return;
        }
        if (i4 == 3) {
            if (image != null) {
                p(image, callback);
            }
        } else {
            if (i4 == 4) {
                M(new h(callback));
                return;
            }
            d0().c(ProtectedSandApp.s("හ"));
            if (callback != null) {
                callback.b(-100, ProtectedSandApp.s("ළ"));
            }
        }
    }

    public final void k0(@l Context context, boolean isSupportContinuousWheat) {
        l0.p(context, ProtectedSandApp.s("ග"));
        d0().c(ProtectedSandApp.s("ෆ"));
        this.mLivePusher = isSupportContinuousWheat ? new V2TXLivePusherImpl(context, V2TXLiveDef.V2TXLiveMode.TXLiveMode_RTC) : new V2TXLivePusherImpl(context, V2TXLiveDef.V2TXLiveMode.TXLiveMode_RTMP);
    }

    @Override // b4.b
    public void l(int x4, int y4, @m com.cby.txliteav.live.listener.a callback) {
        TXDeviceManager deviceManager;
        V2TXLivePusher v2TXLivePusher = this.mLivePusher;
        b0((v2TXLivePusher == null || (deviceManager = v2TXLivePusher.getDeviceManager()) == null) ? null : Integer.valueOf(deviceManager.setCameraFocusPosition(x4, y4)), callback);
    }

    @Override // b4.b
    public void m(@m com.cby.txliteav.live.listener.a callback) {
        d0().c(ProtectedSandApp.s("\u0dc7"));
        boolean isPushing = isPushing();
        if (isPushing) {
            N();
        }
        l0();
        F(null);
        if (isPushing) {
            V2TXLivePusher v2TXLivePusher = this.mLivePusher;
            b0(v2TXLivePusher != null ? Integer.valueOf(v2TXLivePusher.stopPush()) : null, new g(callback));
        } else {
            this.mPushFlag = false;
            if (callback != null) {
                callback.a();
            }
        }
    }

    @Override // b4.b
    public void n(boolean frontCamera, @m com.cby.txliteav.live.listener.a callback) {
        TXDeviceManager deviceManager;
        d0().c(ProtectedSandApp.s("\u0dc8"));
        V2TXLivePusher v2TXLivePusher = this.mLivePusher;
        b0((v2TXLivePusher == null || (deviceManager = v2TXLivePusher.getDeviceManager()) == null) ? null : Integer.valueOf(deviceManager.switchCamera(frontCamera)), callback);
    }

    @Override // b4.b
    public void p(@l Bitmap image, @m com.cby.txliteav.live.listener.a callback) {
        l0.p(image, ProtectedSandApp.s("\u0dc9"));
        this.mVirtualCameraImage = image;
        V2TXLivePusher v2TXLivePusher = this.mLivePusher;
        Integer valueOf = v2TXLivePusher != null ? Integer.valueOf(v2TXLivePusher.startVirtualCamera(image)) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.mCollectionSource = com.cby.txliteav.live.d.IMAGE;
            d0().c(ProtectedSandApp.s("්"));
            if (callback != null) {
                callback.a();
                return;
            }
            return;
        }
        d0().c(ProtectedSandApp.s("\u0dcb") + valueOf);
        if (callback != null) {
            callback.b(valueOf, ProtectedSandApp.s("\u0dcc"));
        }
    }

    @Override // b4.b
    public void q(boolean mirror, @m com.cby.txliteav.live.listener.a callback) {
        V2TXLivePusher v2TXLivePusher = this.mLivePusher;
        b0(v2TXLivePusher != null ? Integer.valueOf(v2TXLivePusher.setEncoderMirror(mirror)) : null, callback);
    }

    @Override // b4.b
    public void s() {
        V2TXLivePusher v2TXLivePusher;
        d0().c(ProtectedSandApp.s("\u0dcd"));
        if (isPushing() && (v2TXLivePusher = this.mLivePusher) != null && v2TXLivePusher.pauseAudio() == 0) {
            this.mPushAudioFlag = false;
        }
    }

    @Override // b4.b
    public void setVoiceCaptureVolume(int volume) {
        TXAudioEffectManager audioEffectManager;
        V2TXLivePusher v2TXLivePusher = this.mLivePusher;
        if (v2TXLivePusher == null || (audioEffectManager = v2TXLivePusher.getAudioEffectManager()) == null) {
            return;
        }
        audioEffectManager.setVoiceCaptureVolume(volume);
    }

    @Override // b4.b
    public void showDebugView(boolean isShow) {
        V2TXLivePusher v2TXLivePusher = this.mLivePusher;
        if (v2TXLivePusher != null) {
            v2TXLivePusher.showDebugView(isShow);
        }
    }

    @Override // b4.b
    public void w(@l k mirror, @m com.cby.txliteav.live.listener.a callback) {
        V2TXLiveDef.V2TXLiveMirrorType v2TXLiveMirrorType;
        l0.p(mirror, ProtectedSandApp.s("\u0dce"));
        int i4 = a.f46637g[mirror.ordinal()];
        if (i4 == 1) {
            v2TXLiveMirrorType = V2TXLiveDef.V2TXLiveMirrorType.V2TXLiveMirrorTypeAuto;
        } else if (i4 == 2) {
            v2TXLiveMirrorType = V2TXLiveDef.V2TXLiveMirrorType.V2TXLiveMirrorTypeEnable;
        } else {
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            v2TXLiveMirrorType = V2TXLiveDef.V2TXLiveMirrorType.V2TXLiveMirrorTypeDisable;
        }
        V2TXLivePusher v2TXLivePusher = this.mLivePusher;
        b0(v2TXLivePusher != null ? Integer.valueOf(v2TXLivePusher.setRenderMirror(v2TXLiveMirrorType)) : null, callback);
    }

    @Override // b4.b
    public void x(@l String msg) {
        l0.p(msg, ProtectedSandApp.s("ා"));
        d0().c(ProtectedSandApp.s("ැ") + msg);
        V2TXLivePusher v2TXLivePusher = this.mLivePusher;
        if (v2TXLivePusher != null) {
            byte[] bytes = msg.getBytes(kotlin.text.f.UTF_8);
            l0.o(bytes, ProtectedSandApp.s("ෑ"));
            v2TXLivePusher.sendSeiMessage(242, bytes);
        }
    }

    @Override // b4.b
    public void y(@m com.cby.txliteav.live.listener.a callback) {
        V2TXLivePusher v2TXLivePusher = this.mLivePusher;
        b0(v2TXLivePusher != null ? Integer.valueOf(v2TXLivePusher.stopScreenCapture()) : null, callback);
    }

    @Override // b4.b
    public void z(@l u resolution, @m Boolean isLandscape, @m com.cby.txliteav.live.listener.a callback) {
        V2TXLiveDef.V2TXLiveVideoResolution v2TXLiveVideoResolution;
        Integer num;
        l0.p(resolution, ProtectedSandApp.s("ි"));
        switch (a.f46633c[resolution.ordinal()]) {
            case 1:
                v2TXLiveVideoResolution = V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution480x480;
                break;
            case 2:
                v2TXLiveVideoResolution = V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution640x360;
                break;
            case 3:
                v2TXLiveVideoResolution = V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution640x480;
                break;
            case 4:
                v2TXLiveVideoResolution = V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution960x540;
                break;
            case 5:
                v2TXLiveVideoResolution = V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution1280x720;
                break;
            case 6:
                v2TXLiveVideoResolution = V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution1920x1080;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        V2TXLiveDef.V2TXLiveVideoResolutionMode v2TXLiveVideoResolutionMode = l0.g(isLandscape, Boolean.TRUE) ? V2TXLiveDef.V2TXLiveVideoResolutionMode.V2TXLiveVideoResolutionModeLandscape : V2TXLiveDef.V2TXLiveVideoResolutionMode.V2TXLiveVideoResolutionModePortrait;
        V2TXLivePusher v2TXLivePusher = this.mLivePusher;
        if (v2TXLivePusher != null) {
            V2TXLiveDef.V2TXLiveVideoEncoderParam v2TXLiveVideoEncoderParam = new V2TXLiveDef.V2TXLiveVideoEncoderParam(v2TXLiveVideoResolution);
            v2TXLiveVideoEncoderParam.videoResolutionMode = v2TXLiveVideoResolutionMode;
            k2 k2Var = k2.f75408a;
            num = Integer.valueOf(v2TXLivePusher.setVideoQuality(v2TXLiveVideoEncoderParam));
        } else {
            num = null;
        }
        b0(num, callback);
    }
}
