package pe;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.text.ParsePosition;
import net.time4j.engine.ChronoException;
import net.time4j.engine.p;
import net.time4j.engine.r;
import net.time4j.format.j;
import net.time4j.format.v;

/* compiled from: DualFormatElement.java */
/* loaded from: classes7.dex */
public interface a extends v<Integer> {
    public static final net.time4j.engine.c<Integer> G2 = net.time4j.format.a.e(ProtectedSandApp.s("諩\u0001"), Integer.class);

    void T(p pVar, Appendable appendable, net.time4j.engine.d dVar, j jVar, char c5, int i4, int i5) throws IOException, ChronoException;

    Integer x(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar, r<?> rVar);
}
