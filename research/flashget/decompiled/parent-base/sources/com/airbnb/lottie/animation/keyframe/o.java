package com.airbnb.lottie.animation.keyframe;

import java.util.List;

/* compiled from: TextKeyframeAnimation.java */
/* loaded from: classes3.dex */
public class o extends g<com.airbnb.lottie.model.b> {

    /* compiled from: TextKeyframeAnimation.java */
    class a extends com.airbnb.lottie.value.j<com.airbnb.lottie.model.b> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.airbnb.lottie.value.b f38846d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.airbnb.lottie.value.j f38847e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.airbnb.lottie.model.b f38848f;

        a(com.airbnb.lottie.value.b bVar, com.airbnb.lottie.value.j jVar, com.airbnb.lottie.model.b bVar2) {
            this.f38846d = bVar;
            this.f38847e = jVar;
            this.f38848f = bVar2;
        }

        @Override // com.airbnb.lottie.value.j
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public com.airbnb.lottie.model.b a(com.airbnb.lottie.value.b<com.airbnb.lottie.model.b> bVar) {
            this.f38846d.h(bVar.f(), bVar.a(), bVar.g().f38969a, bVar.b().f38969a, bVar.d(), bVar.c(), bVar.e());
            String str = (String) this.f38847e.a(this.f38846d);
            com.airbnb.lottie.model.b b5 = bVar.c() == 1.0f ? bVar.b() : bVar.g();
            this.f38848f.a(str, b5.f38970b, b5.f38971c, b5.f38972d, b5.f38973e, b5.f38974f, b5.f38975g, b5.f38976h, b5.f38977i, b5.f38978j, b5.f38979k);
            return this.f38848f;
        }
    }

    public o(List<com.airbnb.lottie.value.a<com.airbnb.lottie.model.b>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public com.airbnb.lottie.model.b i(com.airbnb.lottie.value.a<com.airbnb.lottie.model.b> aVar, float f4) {
        com.airbnb.lottie.model.b bVar;
        com.airbnb.lottie.value.j<A> jVar = this.f38805e;
        if (jVar == 0) {
            return (f4 != 1.0f || (bVar = aVar.f39406c) == null) ? aVar.f39405b : bVar;
        }
        float f5 = aVar.f39410g;
        Float f6 = aVar.f39411h;
        float floatValue = f6 == null ? Float.MAX_VALUE : f6.floatValue();
        com.airbnb.lottie.model.b bVar2 = aVar.f39405b;
        com.airbnb.lottie.model.b bVar3 = bVar2;
        com.airbnb.lottie.model.b bVar4 = aVar.f39406c;
        return (com.airbnb.lottie.model.b) jVar.b(f5, floatValue, bVar3, bVar4 == null ? bVar2 : bVar4, f4, d(), f());
    }

    public void q(com.airbnb.lottie.value.j<String> jVar) {
        super.n(new a(new com.airbnb.lottie.value.b(), jVar, new com.airbnb.lottie.model.b()));
    }
}
