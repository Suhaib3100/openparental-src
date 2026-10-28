package net.time4j.format.expert;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.Set;

/* compiled from: SkipProcessor.java */
/* loaded from: classes7.dex */
final class c0 implements i<Void> {

    /* renamed from: b, reason: collision with root package name */
    private final int f82890b;

    /* renamed from: c, reason: collision with root package name */
    private final net.time4j.engine.o<Character> f82891c;

    c0(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("鐗\u0001"), i4));
        }
        this.f82891c = null;
        this.f82890b = i4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (this.f82890b == c0Var.f82890b) {
            net.time4j.engine.o<Character> oVar = this.f82891c;
            net.time4j.engine.o<Character> oVar2 = c0Var.f82891c;
            if (oVar == null) {
                if (oVar2 == null) {
                    return true;
                }
            } else if (oVar.equals(oVar2)) {
                return true;
            }
        }
        return false;
    }

    @Override // net.time4j.format.expert.i
    public net.time4j.engine.q<Void> getElement() {
        return null;
    }

    public int hashCode() {
        net.time4j.engine.o<Character> oVar = this.f82891c;
        if (oVar == null) {
            return this.f82890b;
        }
        return oVar.hashCode() ^ (~this.f82890b);
    }

    @Override // net.time4j.format.expert.i
    public boolean isNumerical() {
        return false;
    }

    @Override // net.time4j.format.expert.i
    public void parse(CharSequence charSequence, w wVar, net.time4j.engine.d dVar, x<?> xVar, boolean z4) {
        int i4;
        int i5;
        int f4 = wVar.f();
        int length = charSequence.length();
        if (this.f82891c == null) {
            i4 = length - this.f82890b;
        } else {
            int i6 = f4;
            for (int i7 = 0; i7 < this.f82890b && (i5 = i7 + f4) < length && this.f82891c.test(Character.valueOf(charSequence.charAt(i5))); i7++) {
                i6++;
            }
            i4 = i6;
        }
        int min = Math.min(Math.max(i4, 0), length);
        if (min > f4) {
            wVar.m(min);
        }
    }

    @Override // net.time4j.format.expert.i
    public int print(net.time4j.engine.p pVar, Appendable appendable, net.time4j.engine.d dVar, Set<h> set, boolean z4) throws IOException {
        return 0;
    }

    @Override // net.time4j.format.expert.i
    public i<Void> quickPath(c<?> cVar, net.time4j.engine.d dVar, int i4) {
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(c0.class.getName());
        if (this.f82891c == null) {
            sb.append(ProtectedSandApp.s("鐚\u0001"));
            sb.append(this.f82890b);
        } else {
            sb.append(ProtectedSandApp.s("鐛\u0001"));
            sb.append(this.f82891c);
            sb.append(ProtectedSandApp.s("鐜\u0001"));
            sb.append(this.f82890b);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // net.time4j.format.expert.i
    public i<Void> withElement(net.time4j.engine.q<Void> qVar) {
        return this;
    }

    c0(net.time4j.engine.o<Character> oVar, int i4) {
        if (oVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("鐙\u0001"));
        }
        if (i4 >= 1) {
            this.f82891c = oVar;
            this.f82890b = i4;
            return;
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("鐘\u0001"), i4));
    }
}
