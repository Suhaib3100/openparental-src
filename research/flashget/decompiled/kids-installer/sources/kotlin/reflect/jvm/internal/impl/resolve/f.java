package kotlin.reflect.jvm.internal.impl.resolve;

/* compiled from: ExternalOverridabilityCondition.java */
/* loaded from: classes5.dex */
public interface f {

    /* compiled from: ExternalOverridabilityCondition.java */
    public enum a {
        CONFLICTS_ONLY,
        SUCCESS_ONLY,
        BOTH
    }

    /* compiled from: ExternalOverridabilityCondition.java */
    public enum b {
        OVERRIDABLE,
        CONFLICT,
        INCOMPATIBLE,
        UNKNOWN
    }

    @d5.d
    a a();

    @d5.d
    b b(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, @d5.e kotlin.reflect.jvm.internal.impl.descriptors.e eVar);
}
