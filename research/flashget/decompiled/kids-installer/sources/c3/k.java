package c3;

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
/* loaded from: classes5.dex */
public interface k {
    void a(@o0 Object uri, @o0 PhotoView snapshot, @q0 ImageView srcView);

    File b(@o0 Context context, @o0 Object uri);

    View c(int position, @o0 Object uri, @o0 ImageViewerPopupView popupView, @o0 PhotoView snapshot, @o0 ProgressBar progressBar);
}
