package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.EnumMap;
import kotlin.jvm.internal.l0;

/* compiled from: JavaTypeQualifiersByElementType.kt */
/* loaded from: classes5.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final EnumMap<b, r> f24927a;

    public y(@d5.d EnumMap<b, r> enumMap) {
        l0.p(enumMap, ProtectedSandApp.s("䮀"));
        this.f24927a = enumMap;
    }

    @d5.e
    public final r a(@d5.e b bVar) {
        return this.f24927a.get(bVar);
    }

    @d5.d
    public final EnumMap<b, r> b() {
        return this.f24927a;
    }
}
