package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;

/* compiled from: CallableMemberDescriptor.java */
/* loaded from: classes6.dex */
public interface b extends kotlin.reflect.jvm.internal.impl.descriptors.a, d0 {

    /* compiled from: CallableMemberDescriptor.java */
    /* loaded from: classes5.dex */
    public enum a {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        public boolean isReal() {
            return this != FAKE_OVERRIDE;
        }
    }

    void E0(@d5.d Collection<? extends b> collection);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.m
    @d5.d
    b a();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.d
    Collection<? extends b> g();

    @d5.d
    a j();

    @d5.d
    b r0(m mVar, e0 e0Var, u uVar, a aVar, boolean z5);
}
