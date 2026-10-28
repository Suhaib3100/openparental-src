package bolts;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes3.dex */
public class ExecutorException extends RuntimeException {
    public ExecutorException(Exception exc) {
        super(ProtectedSandApp.s("×"), exc);
    }
}
