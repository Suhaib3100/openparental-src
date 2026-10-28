package okhttp3.internal.connection;

import java.net.Proxy;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final /* synthetic */ class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f84433a;

    static {
        int[] iArr = new int[Proxy.Type.values().length];
        f84433a = iArr;
        iArr[Proxy.Type.DIRECT.ordinal()] = 1;
        iArr[Proxy.Type.HTTP.ordinal()] = 2;
    }
}
