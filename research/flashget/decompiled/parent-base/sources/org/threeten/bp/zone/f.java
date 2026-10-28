package org.threeten.bp.zone;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import org.threeten.bp.s;

/* compiled from: ZoneRules.java */
/* loaded from: classes9.dex */
public abstract class f {

    /* compiled from: ZoneRules.java */
    static final class a extends f implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        private static final long f88446c = -8733721350312276297L;

        /* renamed from: b, reason: collision with root package name */
        private final s f88447b;

        a(s sVar) {
            this.f88447b = sVar;
        }

        @Override // org.threeten.bp.zone.f
        public org.threeten.bp.e a(org.threeten.bp.f fVar) {
            return org.threeten.bp.e.f88068d;
        }

        @Override // org.threeten.bp.zone.f
        public s b(org.threeten.bp.f fVar) {
            return this.f88447b;
        }

        @Override // org.threeten.bp.zone.f
        public s c(org.threeten.bp.h hVar) {
            return this.f88447b;
        }

        @Override // org.threeten.bp.zone.f
        public s d(org.threeten.bp.f fVar) {
            return this.f88447b;
        }

        @Override // org.threeten.bp.zone.f
        public d e(org.threeten.bp.h hVar) {
            return null;
        }

        @Override // org.threeten.bp.zone.f
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return this.f88447b.equals(((a) obj).f88447b);
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.j() && this.f88447b.equals(bVar.b(org.threeten.bp.f.f88077d));
        }

        @Override // org.threeten.bp.zone.f
        public List<e> f() {
            return Collections.emptyList();
        }

        @Override // org.threeten.bp.zone.f
        public List<d> g() {
            return Collections.emptyList();
        }

        @Override // org.threeten.bp.zone.f
        public List<s> h(org.threeten.bp.h hVar) {
            return Collections.singletonList(this.f88447b);
        }

        @Override // org.threeten.bp.zone.f
        public int hashCode() {
            return ((this.f88447b.hashCode() + 31) ^ (this.f88447b.hashCode() + 31)) ^ 1;
        }

        @Override // org.threeten.bp.zone.f
        public boolean i(org.threeten.bp.f fVar) {
            return false;
        }

        @Override // org.threeten.bp.zone.f
        public boolean j() {
            return true;
        }

        @Override // org.threeten.bp.zone.f
        public boolean k(org.threeten.bp.h hVar, s sVar) {
            return this.f88447b.equals(sVar);
        }

        @Override // org.threeten.bp.zone.f
        public d l(org.threeten.bp.f fVar) {
            return null;
        }

        @Override // org.threeten.bp.zone.f
        public d o(org.threeten.bp.f fVar) {
            return null;
        }

        public String toString() {
            return "FixedRules:" + this.f88447b;
        }
    }

    f() {
    }

    public static f m(s sVar) {
        ng.d.j(sVar, "offset");
        return new a(sVar);
    }

    public static f n(s sVar, s sVar2, List<d> list, List<d> list2, List<e> list3) {
        ng.d.j(sVar, "baseStandardOffset");
        ng.d.j(sVar2, "baseWallOffset");
        ng.d.j(list, "standardOffsetTransitionList");
        ng.d.j(list2, "transitionList");
        ng.d.j(list3, "lastRules");
        return new b(sVar, sVar2, list, list2, list3);
    }

    public abstract org.threeten.bp.e a(org.threeten.bp.f fVar);

    public abstract s b(org.threeten.bp.f fVar);

    public abstract s c(org.threeten.bp.h hVar);

    public abstract s d(org.threeten.bp.f fVar);

    public abstract d e(org.threeten.bp.h hVar);

    public abstract boolean equals(Object obj);

    public abstract List<e> f();

    public abstract List<d> g();

    public abstract List<s> h(org.threeten.bp.h hVar);

    public abstract int hashCode();

    public abstract boolean i(org.threeten.bp.f fVar);

    public abstract boolean j();

    public abstract boolean k(org.threeten.bp.h hVar, s sVar);

    public abstract d l(org.threeten.bp.f fVar);

    public abstract d o(org.threeten.bp.f fVar);
}
