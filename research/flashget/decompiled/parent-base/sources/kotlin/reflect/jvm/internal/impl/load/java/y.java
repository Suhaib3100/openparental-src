package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.EnumMap;
import kotlin.jvm.internal.l0;

/* compiled from: JavaTypeQualifiersByElementType.kt */
/* loaded from: classes7.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final EnumMap<b, r> f76804a;

    public y(@fg.l EnumMap<b, r> enumMap) {
        l0.p(enumMap, ProtectedSandApp.s("獈\u0001"));
        this.f76804a = enumMap;
    }

    @fg.m
    public final r a(@fg.m b bVar) {
        return this.f76804a.get(bVar);
    }

    @fg.l
    public final EnumMap<b, r> b() {
        return this.f76804a;
    }
}
