package androidx.databinding;

import androidx.annotation.q0;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class ObservableField<T> extends BaseObservableField implements Serializable {
    static final long serialVersionUID = 1;
    private T mValue;

    public ObservableField(T t4) {
        this.mValue = t4;
    }

    @q0
    public T get() {
        return this.mValue;
    }

    public void set(T t4) {
        if (t4 != this.mValue) {
            this.mValue = t4;
            notifyChange();
        }
    }

    public ObservableField() {
    }

    public ObservableField(Observable... observableArr) {
        super(observableArr);
    }
}
