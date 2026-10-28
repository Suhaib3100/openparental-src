package bolts;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class AggregateException extends Exception {

    /* renamed from: c, reason: collision with root package name */
    private static final long f36849c = 1;

    /* renamed from: d, reason: collision with root package name */
    private static final String f36850d = ProtectedSandApp.s("Ó");

    /* renamed from: b, reason: collision with root package name */
    private List<Throwable> f36851b;

    public AggregateException(String str, Throwable[] thArr) {
        this(str, (List<? extends Throwable>) Arrays.asList(thArr));
    }

    @Deprecated
    public Throwable[] a() {
        List<Throwable> list = this.f36851b;
        return (Throwable[]) list.toArray(new Throwable[list.size()]);
    }

    @Deprecated
    public List<Exception> b() {
        ArrayList arrayList = new ArrayList();
        List<Throwable> list = this.f36851b;
        if (list == null) {
            return arrayList;
        }
        for (Throwable th : list) {
            if (th instanceof Exception) {
                arrayList.add((Exception) th);
            } else {
                arrayList.add(new Exception(th));
            }
        }
        return arrayList;
    }

    public List<Throwable> c() {
        return this.f36851b;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        int i4 = -1;
        for (Throwable th : this.f36851b) {
            String s4 = ProtectedSandApp.s("Ô");
            printStream.append((CharSequence) s4);
            printStream.append((CharSequence) ProtectedSandApp.s("Õ"));
            i4++;
            printStream.append((CharSequence) Integer.toString(i4));
            printStream.append((CharSequence) ProtectedSandApp.s("Ö"));
            th.printStackTrace(printStream);
            printStream.append((CharSequence) s4);
        }
    }

    public AggregateException(String str, List<? extends Throwable> list) {
        super(str, (list == null || list.size() <= 0) ? null : list.get(0));
        this.f36851b = Collections.unmodifiableList(list);
    }

    public AggregateException(List<? extends Throwable> list) {
        this(ProtectedSandApp.s("Ó"), list);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        int i4 = -1;
        for (Throwable th : this.f36851b) {
            String s4 = ProtectedSandApp.s("Ô");
            printWriter.append((CharSequence) s4);
            printWriter.append((CharSequence) ProtectedSandApp.s("Õ"));
            i4++;
            printWriter.append((CharSequence) Integer.toString(i4));
            printWriter.append((CharSequence) ProtectedSandApp.s("Ö"));
            th.printStackTrace(printWriter);
            printWriter.append((CharSequence) s4);
        }
    }
}
