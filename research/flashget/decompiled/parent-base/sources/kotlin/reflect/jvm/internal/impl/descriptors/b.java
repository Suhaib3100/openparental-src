package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;

/* compiled from: CallableMemberDescriptor.java */
/* loaded from: classes7.dex */
public interface b extends kotlin.reflect.jvm.internal.impl.descriptors.a, d0 {

    /* compiled from: CallableMemberDescriptor.java */
    public enum a {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        public boolean isReal() {
            return this != FAKE_OVERRIDE;
        }
    }

    void F0(@fg.l Collection<? extends b> collection);

    @fg.l
    b R(m mVar, e0 e0Var, u uVar, a aVar, boolean z4);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.m
    @fg.l
    b a();

    @fg.l
    a b();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @fg.l
    Collection<? extends b> e();
}
