package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: RecomposeScopeImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0006\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0002\u0010\u0005\"\u0014\u0010\t\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0005\"\u0014\u0010\u000b\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0005\"\u0014\u0010\r\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0005\"\u0014\u0010\u000f\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005\"\u0014\u0010\u0011\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005\"\u0014\u0010\u0013\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0005\"\u0014\u0010\u0015\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0005\"\u0014\u0010\u0017\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0005\"\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"", "flags", "b", "(I)I", "a", "I", "changedLowBitMask", "changedHighBitMask", "c", "changedMask", "d", "UsedFlag", "e", "DefaultsInScopeFlag", "f", "DefaultsInvalidFlag", "g", "RequiresRecomposeFlag", "h", "SkippedFlag", "i", "RereadingFlag", "j", "ForcedRecomposeFlag", "", "k", "Ljava/lang/Object;", "callbackLock", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g3 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f16421a = 306783378;

    /* renamed from: b, reason: collision with root package name */
    private static final int f16422b = 613566756;

    /* renamed from: c, reason: collision with root package name */
    private static final int f16423c = -920350135;

    /* renamed from: d, reason: collision with root package name */
    private static final int f16424d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static final int f16425e = 2;

    /* renamed from: f, reason: collision with root package name */
    private static final int f16426f = 4;

    /* renamed from: g, reason: collision with root package name */
    private static final int f16427g = 8;

    /* renamed from: h, reason: collision with root package name */
    private static final int f16428h = 16;

    /* renamed from: i, reason: collision with root package name */
    private static final int f16429i = 32;

    /* renamed from: j, reason: collision with root package name */
    private static final int f16430j = 64;

    /* renamed from: k, reason: collision with root package name */
    @fg.l
    private static final Object f16431k = new Object();

    @kotlin.w0
    public static final int b(int i4) {
        int i5 = f16421a & i4;
        int i6 = f16422b & i4;
        return (i4 & f16423c) | (i6 >> 1) | i5 | ((i5 << 1) & i6);
    }
}
