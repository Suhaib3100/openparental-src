package kotlin.reflect.jvm.internal.impl.resolve;

/* compiled from: ExternalOverridabilityCondition.java */
/* loaded from: classes7.dex */
public interface g {

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

    @fg.l
    a a();

    @fg.l
    b b(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, @fg.m kotlin.reflect.jvm.internal.impl.descriptors.e eVar);
}
