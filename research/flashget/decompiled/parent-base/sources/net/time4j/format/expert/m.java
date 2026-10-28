package net.time4j.format.expert;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.Set;

/* compiled from: IgnorableWhitespaceProcessor.java */
/* loaded from: classes7.dex */
enum m implements i<Void> {
    SINGLETON;

    @Override // net.time4j.format.expert.i
    public net.time4j.engine.q<Void> getElement() {
        return null;
    }

    @Override // net.time4j.format.expert.i
    public boolean isNumerical() {
        return false;
    }

    @Override // net.time4j.format.expert.i
    public void parse(CharSequence charSequence, w wVar, net.time4j.engine.d dVar, x<?> xVar, boolean z4) {
        int f4 = wVar.f();
        while (f4 < charSequence.length() && Character.isWhitespace(charSequence.charAt(f4))) {
            f4++;
        }
        wVar.m(f4);
    }

    @Override // net.time4j.format.expert.i
    public int print(net.time4j.engine.p pVar, Appendable appendable, net.time4j.engine.d dVar, Set<h> set, boolean z4) throws IOException {
        appendable.append(' ');
        return 1;
    }

    @Override // net.time4j.format.expert.i
    public i<Void> quickPath(c<?> cVar, net.time4j.engine.d dVar, int i4) {
        return this;
    }

    @Override // java.lang.Enum
    public String toString() {
        return ProtectedSandApp.s("锂\u0001");
    }

    @Override // net.time4j.format.expert.i
    public i<Void> withElement(net.time4j.engine.q<Void> qVar) {
        return this;
    }
}
