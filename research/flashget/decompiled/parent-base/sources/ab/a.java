package ab;

import android.support.v4.media.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.authoring.tracks.u;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import org.apache.commons.lang3.time.e;

/* compiled from: SrtParser.java */
/* loaded from: classes6.dex */
public class a {
    private static long a(String str) {
        String s4 = ProtectedSandApp.s("\uf0ac");
        long parseLong = Long.parseLong(str.split(s4)[0].trim());
        long parseLong2 = Long.parseLong(str.split(s4)[1].trim());
        String str2 = str.split(s4)[2];
        String s5 = ProtectedSandApp.s("\uf0ad");
        long parseLong3 = Long.parseLong(str2.split(s5)[0].trim());
        return (parseLong3 * 1000) + (parseLong2 * 60000) + (parseLong * e.f86241c) + Long.parseLong(str.split(s4)[2].split(s5)[1].trim());
    }

    public static u b(InputStream inputStream) throws IOException {
        LineNumberReader lineNumberReader = new LineNumberReader(new InputStreamReader(inputStream, ProtectedSandApp.s("\uf0ae")));
        u uVar = new u();
        while (lineNumberReader.readLine() != null) {
            String readLine = lineNumberReader.readLine();
            String str = "";
            while (true) {
                String readLine2 = lineNumberReader.readLine();
                if (readLine2 != null && !readLine2.trim().equals("")) {
                    str = c.a(new StringBuilder(String.valueOf(str)), readLine2, ProtectedSandApp.s("\uf0af"));
                }
            }
            String s4 = ProtectedSandApp.s("\uf0b0");
            uVar.a().add(new u.a(a(readLine.split(s4)[0]), a(readLine.split(s4)[1]), str));
        }
        return uVar;
    }
}
