package gb;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.lxj.xpopup.core.ImageViewerPopupView;
import com.lxj.xpopup.photoview.PhotoView;
import java.io.File;

/* compiled from: XPopupImageLoader.java */
/* loaded from: classes6.dex */
public interface k {
    void a(@o0 Object uri, @o0 PhotoView snapshot, @q0 ImageView srcView);

    View b(int position, @o0 Object uri, @o0 ImageViewerPopupView popupView, @o0 PhotoView snapshot, @o0 ProgressBar progressBar);

    File c(@o0 Context context, @o0 Object uri);
}
