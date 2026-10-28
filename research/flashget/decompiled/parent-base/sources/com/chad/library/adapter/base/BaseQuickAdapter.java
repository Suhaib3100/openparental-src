package com.chad.library.adapter.base;

import android.animation.Animator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.d0;
import androidx.annotation.g0;
import androidx.annotation.j0;
import androidx.annotation.o0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.k;
import com.chad.library.adapter.base.BaseQuickAdapterModuleImp;
import com.chad.library.adapter.base.animation.AlphaInAnimation;
import com.chad.library.adapter.base.animation.BaseAnimation;
import com.chad.library.adapter.base.animation.ScaleInAnimation;
import com.chad.library.adapter.base.animation.SlideInBottomAnimation;
import com.chad.library.adapter.base.animation.SlideInLeftAnimation;
import com.chad.library.adapter.base.animation.SlideInRightAnimation;
import com.chad.library.adapter.base.diff.BrvahAsyncDiffer;
import com.chad.library.adapter.base.diff.BrvahAsyncDifferConfig;
import com.chad.library.adapter.base.diff.BrvahListUpdateCallback;
import com.chad.library.adapter.base.listener.BaseListenerImp;
import com.chad.library.adapter.base.listener.GridSpanSizeLookup;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.chad.library.adapter.base.listener.OnItemChildLongClickListener;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.chad.library.adapter.base.listener.OnItemLongClickListener;
import com.chad.library.adapter.base.module.BaseDraggableModule;
import com.chad.library.adapter.base.module.BaseLoadMoreModule;
import com.chad.library.adapter.base.module.BaseUpFetchModule;
import com.chad.library.adapter.base.module.DraggableModule;
import com.chad.library.adapter.base.module.LoadMoreModule;
import com.chad.library.adapter.base.module.UpFetchModule;
import com.chad.library.adapter.base.util.AdapterUtilsKt;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericSignatureFormatError;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kd.j;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.k;
import kotlin.x0;

/* compiled from: BaseQuickAdapter.kt */
@Metadata(d1 = {"\u0000¢\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b,\b&\u0018\u0000 «\u0002*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u00042\u00020\u00052\u00020\u0006:\u0004¬\u0002«\u0002B%\b\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00102\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0016\u001a\u0004\u0018\u00018\u00012\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00028\u00012\u0006\u0010\u001c\u001a\u00028\u0000H$¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00028\u00012\u0006\u0010\u001c\u001a\u00028\u00002\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0014¢\u0006\u0004\b\u001d\u0010\"J\u001f\u0010&\u001a\u00028\u00012\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0007H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0007H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0007H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00028\u00012\u0006\u0010*\u001a\u00020\u0007H\u0016¢\u0006\u0004\b-\u0010.J-\u0010-\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00028\u00012\u0006\u0010*\u001a\u00020\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\tH\u0016¢\u0006\u0004\b-\u0010/J\u0017\u00101\u001a\u0002002\u0006\u0010*\u001a\u00020\u0007H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00028\u0001H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\r2\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\r2\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b9\u00108J\u0017\u0010<\u001a\u00020;2\u0006\u0010:\u001a\u00020\u0007H\u0014¢\u0006\u0004\b<\u0010=J\u0019\u0010>\u001a\u00028\u00002\b\b\u0001\u0010*\u001a\u00020\u0007H\u0016¢\u0006\u0004\b>\u0010?J\u001b\u0010@\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010*\u001a\u00020\u0007H\u0016¢\u0006\u0004\b@\u0010?J\u0019\u0010A\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\bA\u0010BJ\u0013\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00070C¢\u0006\u0004\bD\u0010EJ\u001b\u0010H\u001a\u00020\r2\f\b\u0001\u0010G\u001a\u00020F\"\u00020\u0007¢\u0006\u0004\bH\u0010IJ\u0013\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00070C¢\u0006\u0004\bJ\u0010EJ\u001b\u0010K\u001a\u00020\r2\f\b\u0001\u0010G\u001a\u00020F\"\u00020\u0007¢\u0006\u0004\bK\u0010IJ\u001f\u0010M\u001a\u00020\r2\u0006\u0010L\u001a\u00028\u00012\u0006\u0010%\u001a\u00020\u0007H\u0014¢\u0006\u0004\bM\u0010.J\u001f\u0010O\u001a\u00020\r2\u0006\u0010N\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u0007H\u0014¢\u0006\u0004\bO\u0010PJ\u001f\u0010Q\u001a\u00020;2\u0006\u0010N\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u0007H\u0014¢\u0006\u0004\bQ\u0010RJ\u001f\u0010S\u001a\u00020\r2\u0006\u0010N\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u0007H\u0014¢\u0006\u0004\bS\u0010PJ\u001f\u0010T\u001a\u00020;2\u0006\u0010N\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u0007H\u0014¢\u0006\u0004\bT\u0010RJ\u001f\u0010U\u001a\u00020\r2\u0006\u0010L\u001a\u00028\u00012\u0006\u0010%\u001a\u00020\u0007H\u0014¢\u0006\u0004\bU\u0010.J\u000f\u0010V\u001a\u00020\u0007H\u0014¢\u0006\u0004\bV\u0010)J\u0017\u0010W\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0007H\u0014¢\u0006\u0004\bW\u0010,J\u001f\u0010X\u001a\u00028\u00012\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0007H\u0014¢\u0006\u0004\bX\u0010'J!\u0010Y\u001a\u00028\u00012\u0006\u0010$\u001a\u00020#2\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\bY\u0010'J\u0017\u0010Y\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\bY\u0010ZJ\u0017\u0010[\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b[\u0010\u001bJ!\u0010]\u001a\u0004\u0018\u00010\u00142\u0006\u0010*\u001a\u00020\u00072\b\b\u0001\u0010\\\u001a\u00020\u0007¢\u0006\u0004\b]\u0010^J+\u0010a\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010_\u001a\u00020\u00072\b\b\u0002\u0010`\u001a\u00020\u0007H\u0007¢\u0006\u0004\ba\u0010bJ+\u0010c\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010_\u001a\u00020\u00072\b\b\u0002\u0010`\u001a\u00020\u0007H\u0007¢\u0006\u0004\bc\u0010bJ\r\u0010d\u001a\u00020;¢\u0006\u0004\bd\u0010eJ\u0015\u0010g\u001a\u00020\r2\u0006\u0010f\u001a\u00020\u0014¢\u0006\u0004\bg\u0010hJ\r\u0010i\u001a\u00020\r¢\u0006\u0004\bi\u0010\u000fJ+\u0010j\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010_\u001a\u00020\u00072\b\b\u0002\u0010`\u001a\u00020\u0007H\u0007¢\u0006\u0004\bj\u0010bJ+\u0010k\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010_\u001a\u00020\u00072\b\b\u0002\u0010`\u001a\u00020\u0007H\u0007¢\u0006\u0004\bk\u0010bJ\u0015\u0010m\u001a\u00020\r2\u0006\u0010l\u001a\u00020\u0014¢\u0006\u0004\bm\u0010hJ\r\u0010n\u001a\u00020\r¢\u0006\u0004\bn\u0010\u000fJ\r\u0010o\u001a\u00020;¢\u0006\u0004\bo\u0010eJ\u0015\u0010q\u001a\u00020\r2\u0006\u0010p\u001a\u00020\u0014¢\u0006\u0004\bq\u0010hJ\u0015\u0010q\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\bq\u0010rJ\r\u0010s\u001a\u00020\r¢\u0006\u0004\bs\u0010\u000fJ\r\u0010t\u001a\u00020;¢\u0006\u0004\bt\u0010eJ\u001f\u0010w\u001a\u00020\r2\u0006\u0010v\u001a\u00020u2\u0006\u0010_\u001a\u00020\u0007H\u0014¢\u0006\u0004\bw\u0010xJ\u0015\u0010{\u001a\u00020\r2\u0006\u0010z\u001a\u00020y¢\u0006\u0004\b{\u0010|J\u001f\u0010}\u001a\u00020\r2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\tH\u0017¢\u0006\u0004\b}\u0010~J!\u0010\u0080\u0001\u001a\u00020\r2\u000e\u0010\u007f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\tH\u0016¢\u0006\u0005\b\u0080\u0001\u0010~J\"\u0010\u0083\u0001\u001a\u00020\r2\u000e\u0010\u0082\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0081\u0001H\u0017¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J#\u0010\u0085\u0001\u001a\u00020\r2\u000f\u0010\u007f\u001a\u000b\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0081\u0001H\u0016¢\u0006\u0006\b\u0085\u0001\u0010\u0084\u0001J$\u0010\u0086\u0001\u001a\u00020\r2\b\b\u0001\u0010_\u001a\u00020\u00072\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J$\u0010\u0088\u0001\u001a\u00020\r2\b\b\u0001\u0010*\u001a\u00020\u00072\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0006\b\u0088\u0001\u0010\u0087\u0001J\u001c\u0010\u0088\u0001\u001a\u00020\r2\b\b\u0001\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J,\u0010\u0088\u0001\u001a\u00020\r2\b\b\u0001\u0010*\u001a\u00020\u00072\u000e\u0010\u0082\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0081\u0001H\u0016¢\u0006\u0006\b\u0088\u0001\u0010\u008a\u0001J$\u0010\u0088\u0001\u001a\u00020\r2\u0010\b\u0001\u0010\u0082\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0081\u0001H\u0016¢\u0006\u0006\b\u0088\u0001\u0010\u0084\u0001J\u001b\u0010\u008b\u0001\u001a\u00020\r2\b\b\u0001\u0010*\u001a\u00020\u0007H\u0017¢\u0006\u0005\b\u008b\u0001\u0010rJ\u001b\u0010\u008c\u0001\u001a\u00020\r2\b\b\u0001\u0010*\u001a\u00020\u0007H\u0016¢\u0006\u0005\b\u008c\u0001\u0010rJ\u001a\u0010\u008b\u0001\u001a\u00020\r2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0006\b\u008b\u0001\u0010\u0089\u0001J\u001a\u0010\u008e\u0001\u001a\u00020\r2\u0007\u0010\u008d\u0001\u001a\u00020\u0007H\u0004¢\u0006\u0005\b\u008e\u0001\u0010rJ \u0010\u0091\u0001\u001a\u00020\r2\u000e\u0010\u0090\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u008f\u0001¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J \u0010\u0095\u0001\u001a\u00020\r2\u000e\u0010\u0094\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0093\u0001¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u0019\u0010\u0098\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0097\u0001H\u0007¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u0017\u0010\u009a\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0097\u0001¢\u0006\u0006\b\u009a\u0001\u0010\u0099\u0001J!\u0010\u009b\u0001\u001a\u00020\r2\u000e\u0010\u007f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\tH\u0016¢\u0006\u0005\b\u009b\u0001\u0010~J,\u0010\u009b\u0001\u001a\u00020\r2\n\b\u0001\u0010\u009d\u0001\u001a\u00030\u009c\u00012\f\u0010\u007f\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016¢\u0006\u0006\b\u009b\u0001\u0010\u009e\u0001J\u001e\u0010¡\u0001\u001a\u00020\r2\n\u0010 \u0001\u001a\u0005\u0018\u00010\u009f\u0001H\u0016¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u001e\u0010¥\u0001\u001a\u00020\r2\n\u0010¤\u0001\u001a\u0005\u0018\u00010£\u0001H\u0016¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\u001e\u0010¨\u0001\u001a\u00020\r2\n\u0010¤\u0001\u001a\u0005\u0018\u00010§\u0001H\u0016¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u001e\u0010«\u0001\u001a\u00020\r2\n\u0010¤\u0001\u001a\u0005\u0018\u00010ª\u0001H\u0016¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u001e\u0010®\u0001\u001a\u00020\r2\n\u0010¤\u0001\u001a\u0005\u0018\u00010\u00ad\u0001H\u0016¢\u0006\u0006\b®\u0001\u0010¯\u0001J\u0013\u0010°\u0001\u001a\u0005\u0018\u00010£\u0001¢\u0006\u0006\b°\u0001\u0010±\u0001J\u0013\u0010²\u0001\u001a\u0005\u0018\u00010§\u0001¢\u0006\u0006\b²\u0001\u0010³\u0001J\u0013\u0010´\u0001\u001a\u0005\u0018\u00010ª\u0001¢\u0006\u0006\b´\u0001\u0010µ\u0001J\u0013\u0010¶\u0001\u001a\u0005\u0018\u00010\u00ad\u0001¢\u0006\u0006\b¶\u0001\u0010·\u0001R;\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\r\u0010¸\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0006@@X\u0086\u000e¢\u0006\u0016\n\u0005\b\n\u0010¹\u0001\u001a\u0006\bº\u0001\u0010»\u0001\"\u0005\b¼\u0001\u0010~R(\u0010½\u0001\u001a\u00020;8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b½\u0001\u0010¾\u0001\u001a\u0005\b¿\u0001\u0010e\"\u0006\bÀ\u0001\u0010Á\u0001R(\u0010Â\u0001\u001a\u00020;8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÂ\u0001\u0010¾\u0001\u001a\u0005\bÃ\u0001\u0010e\"\u0006\bÄ\u0001\u0010Á\u0001R(\u0010Å\u0001\u001a\u00020;8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÅ\u0001\u0010¾\u0001\u001a\u0005\bÅ\u0001\u0010e\"\u0006\bÆ\u0001\u0010Á\u0001R(\u0010Ç\u0001\u001a\u00020;8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÇ\u0001\u0010¾\u0001\u001a\u0005\bÈ\u0001\u0010e\"\u0006\bÉ\u0001\u0010Á\u0001R(\u0010Ê\u0001\u001a\u00020;8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÊ\u0001\u0010¾\u0001\u001a\u0005\bË\u0001\u0010e\"\u0006\bÌ\u0001\u0010Á\u0001R(\u0010Í\u0001\u001a\u00020;8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÍ\u0001\u0010¾\u0001\u001a\u0005\bÎ\u0001\u0010e\"\u0006\bÏ\u0001\u0010Á\u0001R(\u0010Ð\u0001\u001a\u00020;8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÐ\u0001\u0010¾\u0001\u001a\u0005\bÐ\u0001\u0010e\"\u0006\bÑ\u0001\u0010Á\u0001R8\u0010Ô\u0001\u001a\u0005\u0018\u00010Ò\u00012\n\u0010Ó\u0001\u001a\u0005\u0018\u00010Ò\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bÔ\u0001\u0010Õ\u0001\u001a\u0006\bÖ\u0001\u0010×\u0001\"\u0006\bØ\u0001\u0010Ù\u0001R\"\u0010Ú\u0001\u001a\u000b\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0097\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÚ\u0001\u0010Û\u0001R\u001a\u0010Ý\u0001\u001a\u00030Ü\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÝ\u0001\u0010Þ\u0001R\u001a\u0010ß\u0001\u001a\u00030Ü\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bß\u0001\u0010Þ\u0001R\u001a\u0010á\u0001\u001a\u00030à\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bá\u0001\u0010â\u0001R\u0019\u0010ã\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bã\u0001\u0010ä\u0001R\u001c\u0010å\u0001\u001a\u0005\u0018\u00010\u009f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bå\u0001\u0010æ\u0001R\u001c\u0010ç\u0001\u001a\u0005\u0018\u00010£\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bç\u0001\u0010è\u0001R\u001c\u0010é\u0001\u001a\u0005\u0018\u00010§\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bé\u0001\u0010ê\u0001R\u001c\u0010ë\u0001\u001a\u0005\u0018\u00010ª\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bë\u0001\u0010ì\u0001R\u001c\u0010í\u0001\u001a\u0005\u0018\u00010\u00ad\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bí\u0001\u0010î\u0001R\u001c\u0010ð\u0001\u001a\u0005\u0018\u00010ï\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bð\u0001\u0010ñ\u0001R\u001c\u0010ó\u0001\u001a\u0005\u0018\u00010ò\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bó\u0001\u0010ô\u0001R,\u0010ö\u0001\u001a\u0005\u0018\u00010õ\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bö\u0001\u0010÷\u0001\u001a\u0006\bø\u0001\u0010ù\u0001\"\u0006\bú\u0001\u0010û\u0001R,\u0010ý\u0001\u001a\u00030ü\u00012\b\u0010¸\u0001\u001a\u00030ü\u00018\u0004@BX\u0084.¢\u0006\u0010\n\u0006\bý\u0001\u0010þ\u0001\u001a\u0006\bÿ\u0001\u0010\u0080\u0002R7\u0010\u0082\u0002\u001a\t\u0012\u0004\u0012\u0002050\u0081\u00028\u0006@\u0006X\u0087.¢\u0006\u001f\n\u0006\b\u0082\u0002\u0010\u0083\u0002\u0012\u0005\b\u0088\u0002\u0010\u000f\u001a\u0006\b\u0084\u0002\u0010\u0085\u0002\"\u0006\b\u0086\u0002\u0010\u0087\u0002R*\u0010\u0089\u0002\u001a\u0004\u0018\u0001058\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0089\u0002\u0010\u008a\u0002\u001a\u0006\b\u008b\u0002\u0010\u008c\u0002\"\u0005\b\u008d\u0002\u00108R\u001d\u0010\u008e\u0002\u001a\b\u0012\u0004\u0012\u00020\u00070C8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0002\u0010\u008f\u0002R\u001d\u0010\u0090\u0002\u001a\b\u0012\u0004\u0012\u00020\u00070C8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0002\u0010\u008f\u0002R\u0015\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\b\u0010ä\u0001R\u0015\u0010\u0092\u0002\u001a\u00030õ\u00018F¢\u0006\b\u001a\u0006\b\u0091\u0002\u0010ù\u0001R\u0015\u0010\u0095\u0002\u001a\u00030ï\u00018F¢\u0006\b\u001a\u0006\b\u0093\u0002\u0010\u0094\u0002R\u0015\u0010\u0098\u0002\u001a\u00030ò\u00018F¢\u0006\b\u001a\u0006\b\u0096\u0002\u0010\u0097\u0002R(\u00106\u001a\u0002052\u0007\u0010Ó\u0001\u001a\u0002058F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u0099\u0002\u0010\u008c\u0002\"\u0005\b\u009a\u0002\u00108R\u0013\u0010\u009c\u0002\u001a\u00020\u00078F¢\u0006\u0007\u001a\u0005\b\u009b\u0002\u0010)R\u0013\u0010\u009e\u0002\u001a\u00020\u00078F¢\u0006\u0007\u001a\u0005\b\u009d\u0002\u0010)R\u0017\u0010¡\u0002\u001a\u0005\u0018\u00010Ü\u00018F¢\u0006\b\u001a\u0006\b\u009f\u0002\u0010 \u0002R\u0013\u0010£\u0002\u001a\u00020\u00078F¢\u0006\u0007\u001a\u0005\b¢\u0002\u0010)R\u0013\u0010¥\u0002\u001a\u00020\u00078F¢\u0006\u0007\u001a\u0005\b¤\u0002\u0010)R\u0017\u0010§\u0002\u001a\u0005\u0018\u00010Ü\u00018F¢\u0006\b\u001a\u0006\b¦\u0002\u0010 \u0002R\u0017\u0010ª\u0002\u001a\u0005\u0018\u00010à\u00018F¢\u0006\b\u001a\u0006\b¨\u0002\u0010©\u0002¨\u0006\u00ad\u0002"}, d2 = {"Lcom/chad/library/adapter/base/BaseQuickAdapter;", "T", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "VH", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/chad/library/adapter/base/BaseQuickAdapterModuleImp;", "Lcom/chad/library/adapter/base/listener/BaseListenerImp;", "", "layoutResId", "", "data", "<init>", "(ILjava/util/List;)V", "Lkotlin/k2;", "checkModule", "()V", "Ljava/lang/Class;", "z", "getInstancedGenericKClass", "(Ljava/lang/Class;)Ljava/lang/Class;", "Landroid/view/View;", "view", "createBaseGenericKInstance", "(Ljava/lang/Class;Landroid/view/View;)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$e0;", "holder", "addAnimation", "(Landroidx/recyclerview/widget/RecyclerView$e0;)V", "item", "convert", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V", "", "", "payloads", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "getItemCount", "()I", "position", "getItemViewType", "(I)I", "onBindViewHolder", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;I)V", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;ILjava/util/List;)V", "", "getItemId", "(I)J", "onViewAttachedToWindow", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onAttachedToRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "onDetachedFromRecyclerView", "type", "", "isFixedViewType", "(I)Z", "getItem", "(I)Ljava/lang/Object;", "getItemOrNull", "getItemPosition", "(Ljava/lang/Object;)I", "Ljava/util/LinkedHashSet;", "getChildClickViewIds", "()Ljava/util/LinkedHashSet;", "", "viewIds", "addChildClickViewIds", "([I)V", "getChildLongClickViewIds", "addChildLongClickViewIds", "viewHolder", "bindViewClickListener", "v", "setOnItemClick", "(Landroid/view/View;I)V", "setOnItemLongClick", "(Landroid/view/View;I)Z", "setOnItemChildClick", "setOnItemChildLongClick", "onItemViewHolderCreated", "getDefItemCount", "getDefItemViewType", "onCreateDefViewHolder", "createBaseViewHolder", "(Landroid/view/View;)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "setFullSpan", "viewId", "getViewByPosition", "(II)Landroid/view/View;", "index", "orientation", "addHeaderView", "(Landroid/view/View;II)I", "setHeaderView", "hasHeaderLayout", "()Z", "header", "removeHeaderView", "(Landroid/view/View;)V", "removeAllHeaderView", "addFooterView", "setFooterView", "footer", "removeFooterView", "removeAllFooterView", "hasFooterLayout", "emptyView", "setEmptyView", "(I)V", "removeEmptyView", "hasEmptyView", "Landroid/animation/Animator;", "anim", "startAnim", "(Landroid/animation/Animator;I)V", "Lcom/chad/library/adapter/base/BaseQuickAdapter$AnimationType;", "animationType", "setAnimationWithDefault", "(Lcom/chad/library/adapter/base/BaseQuickAdapter$AnimationType;)V", "setNewData", "(Ljava/util/List;)V", "list", "setNewInstance", "", "newData", "replaceData", "(Ljava/util/Collection;)V", "setList", "setData", "(ILjava/lang/Object;)V", "addData", "(Ljava/lang/Object;)V", "(ILjava/util/Collection;)V", "remove", "removeAt", "size", "compatibilityDataSizeChanged", "Landroidx/recyclerview/widget/k$f;", "diffCallback", "setDiffCallback", "(Landroidx/recyclerview/widget/k$f;)V", "Lcom/chad/library/adapter/base/diff/BrvahAsyncDifferConfig;", "config", "setDiffConfig", "(Lcom/chad/library/adapter/base/diff/BrvahAsyncDifferConfig;)V", "Lcom/chad/library/adapter/base/diff/BrvahAsyncDiffer;", "getDiffHelper", "()Lcom/chad/library/adapter/base/diff/BrvahAsyncDiffer;", "getDiffer", "setDiffNewData", "Landroidx/recyclerview/widget/k$e;", "diffResult", "(Landroidx/recyclerview/widget/k$e;Ljava/util/List;)V", "Lcom/chad/library/adapter/base/listener/GridSpanSizeLookup;", "spanSizeLookup", "setGridSpanSizeLookup", "(Lcom/chad/library/adapter/base/listener/GridSpanSizeLookup;)V", "Lcom/chad/library/adapter/base/listener/OnItemClickListener;", "listener", "setOnItemClickListener", "(Lcom/chad/library/adapter/base/listener/OnItemClickListener;)V", "Lcom/chad/library/adapter/base/listener/OnItemLongClickListener;", "setOnItemLongClickListener", "(Lcom/chad/library/adapter/base/listener/OnItemLongClickListener;)V", "Lcom/chad/library/adapter/base/listener/OnItemChildClickListener;", "setOnItemChildClickListener", "(Lcom/chad/library/adapter/base/listener/OnItemChildClickListener;)V", "Lcom/chad/library/adapter/base/listener/OnItemChildLongClickListener;", "setOnItemChildLongClickListener", "(Lcom/chad/library/adapter/base/listener/OnItemChildLongClickListener;)V", "getOnItemClickListener", "()Lcom/chad/library/adapter/base/listener/OnItemClickListener;", "getOnItemLongClickListener", "()Lcom/chad/library/adapter/base/listener/OnItemLongClickListener;", "getOnItemChildClickListener", "()Lcom/chad/library/adapter/base/listener/OnItemChildClickListener;", "getOnItemChildLongClickListener", "()Lcom/chad/library/adapter/base/listener/OnItemChildLongClickListener;", "<set-?>", "Ljava/util/List;", "getData", "()Ljava/util/List;", "setData$com_github_CymChad_brvah", "headerWithEmptyEnable", "Z", "getHeaderWithEmptyEnable", "setHeaderWithEmptyEnable", "(Z)V", "footerWithEmptyEnable", "getFooterWithEmptyEnable", "setFooterWithEmptyEnable", "isUseEmpty", "setUseEmpty", "headerViewAsFlow", "getHeaderViewAsFlow", "setHeaderViewAsFlow", "footerViewAsFlow", "getFooterViewAsFlow", "setFooterViewAsFlow", "animationEnable", "getAnimationEnable", "setAnimationEnable", "isAnimationFirstOnly", "setAnimationFirstOnly", "Lcom/chad/library/adapter/base/animation/BaseAnimation;", "value", "adapterAnimation", "Lcom/chad/library/adapter/base/animation/BaseAnimation;", "getAdapterAnimation", "()Lcom/chad/library/adapter/base/animation/BaseAnimation;", "setAdapterAnimation", "(Lcom/chad/library/adapter/base/animation/BaseAnimation;)V", "mDiffHelper", "Lcom/chad/library/adapter/base/diff/BrvahAsyncDiffer;", "Landroid/widget/LinearLayout;", "mHeaderLayout", "Landroid/widget/LinearLayout;", "mFooterLayout", "Landroid/widget/FrameLayout;", "mEmptyLayout", "Landroid/widget/FrameLayout;", "mLastPosition", "I", "mSpanSizeLookup", "Lcom/chad/library/adapter/base/listener/GridSpanSizeLookup;", "mOnItemClickListener", "Lcom/chad/library/adapter/base/listener/OnItemClickListener;", "mOnItemLongClickListener", "Lcom/chad/library/adapter/base/listener/OnItemLongClickListener;", "mOnItemChildClickListener", "Lcom/chad/library/adapter/base/listener/OnItemChildClickListener;", "mOnItemChildLongClickListener", "Lcom/chad/library/adapter/base/listener/OnItemChildLongClickListener;", "Lcom/chad/library/adapter/base/module/BaseUpFetchModule;", "mUpFetchModule", "Lcom/chad/library/adapter/base/module/BaseUpFetchModule;", "Lcom/chad/library/adapter/base/module/BaseDraggableModule;", "mDraggableModule", "Lcom/chad/library/adapter/base/module/BaseDraggableModule;", "Lcom/chad/library/adapter/base/module/BaseLoadMoreModule;", "mLoadMoreModule", "Lcom/chad/library/adapter/base/module/BaseLoadMoreModule;", "getMLoadMoreModule$com_github_CymChad_brvah", "()Lcom/chad/library/adapter/base/module/BaseLoadMoreModule;", "setMLoadMoreModule$com_github_CymChad_brvah", "(Lcom/chad/library/adapter/base/module/BaseLoadMoreModule;)V", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ljava/lang/ref/WeakReference;", "weakRecyclerView", "Ljava/lang/ref/WeakReference;", "getWeakRecyclerView", "()Ljava/lang/ref/WeakReference;", "setWeakRecyclerView", "(Ljava/lang/ref/WeakReference;)V", "weakRecyclerView$annotations", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getMRecyclerView$com_github_CymChad_brvah", "()Landroidx/recyclerview/widget/RecyclerView;", "setMRecyclerView$com_github_CymChad_brvah", "childClickViewIds", "Ljava/util/LinkedHashSet;", "childLongClickViewIds", "getLoadMoreModule", "loadMoreModule", "getUpFetchModule", "()Lcom/chad/library/adapter/base/module/BaseUpFetchModule;", "upFetchModule", "getDraggableModule", "()Lcom/chad/library/adapter/base/module/BaseDraggableModule;", "draggableModule", "getRecyclerView", "setRecyclerView", "getHeaderViewPosition", "headerViewPosition", "getHeaderLayoutCount", "headerLayoutCount", "getHeaderLayout", "()Landroid/widget/LinearLayout;", "headerLayout", "getFooterViewPosition", "footerViewPosition", "getFooterLayoutCount", "footerLayoutCount", "getFooterLayout", "footerLayout", "getEmptyLayout", "()Landroid/widget/FrameLayout;", "emptyLayout", "Companion", "AnimationType", "com.github.CymChad.brvah"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public abstract class BaseQuickAdapter<T, VH extends BaseViewHolder> extends RecyclerView.h<VH> implements BaseQuickAdapterModuleImp, BaseListenerImp {
    public static final int EMPTY_VIEW = 268436821;
    public static final int FOOTER_VIEW = 268436275;
    public static final int HEADER_VIEW = 268435729;
    public static final int LOAD_MORE_VIEW = 268436002;

    @m
    private BaseAnimation adapterAnimation;
    private boolean animationEnable;
    private final LinkedHashSet<Integer> childClickViewIds;
    private final LinkedHashSet<Integer> childLongClickViewIds;

    @l
    private Context context;

    @l
    private List<T> data;
    private boolean footerViewAsFlow;
    private boolean footerWithEmptyEnable;
    private boolean headerViewAsFlow;
    private boolean headerWithEmptyEnable;
    private boolean isAnimationFirstOnly;
    private boolean isUseEmpty;
    private final int layoutResId;
    private BrvahAsyncDiffer<T> mDiffHelper;
    private BaseDraggableModule mDraggableModule;
    private FrameLayout mEmptyLayout;
    private LinearLayout mFooterLayout;
    private LinearLayout mHeaderLayout;
    private int mLastPosition;

    @m
    private BaseLoadMoreModule mLoadMoreModule;
    private OnItemChildClickListener mOnItemChildClickListener;
    private OnItemChildLongClickListener mOnItemChildLongClickListener;
    private OnItemClickListener mOnItemClickListener;
    private OnItemLongClickListener mOnItemLongClickListener;

    @m
    private RecyclerView mRecyclerView;
    private GridSpanSizeLookup mSpanSizeLookup;
    private BaseUpFetchModule mUpFetchModule;

    @l
    public WeakReference<RecyclerView> weakRecyclerView;

    /* compiled from: BaseQuickAdapter.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/chad/library/adapter/base/BaseQuickAdapter$AnimationType;", "", "(Ljava/lang/String;I)V", "AlphaIn", "ScaleIn", "SlideInBottom", "SlideInLeft", "SlideInRight", "com.github.CymChad.brvah"}, k = 1, mv = {1, 1, 16})
    public enum AnimationType {
        AlphaIn,
        ScaleIn,
        SlideInBottom,
        SlideInLeft,
        SlideInRight
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 16})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnimationType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[AnimationType.AlphaIn.ordinal()] = 1;
            iArr[AnimationType.ScaleIn.ordinal()] = 2;
            iArr[AnimationType.SlideInBottom.ordinal()] = 3;
            iArr[AnimationType.SlideInLeft.ordinal()] = 4;
            iArr[AnimationType.SlideInRight.ordinal()] = 5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @j
    public BaseQuickAdapter(@j0 int i4) {
        this(i4, null, 2, 0 == true ? 1 : 0);
    }

    public static final /* synthetic */ FrameLayout access$getMEmptyLayout$p(BaseQuickAdapter baseQuickAdapter) {
        FrameLayout frameLayout = baseQuickAdapter.mEmptyLayout;
        if (frameLayout == null) {
            l0.S(ProtectedSandApp.s("ึ"));
        }
        return frameLayout;
    }

    public static final /* synthetic */ LinearLayout access$getMFooterLayout$p(BaseQuickAdapter baseQuickAdapter) {
        LinearLayout linearLayout = baseQuickAdapter.mFooterLayout;
        if (linearLayout == null) {
            l0.S(ProtectedSandApp.s("ื"));
        }
        return linearLayout;
    }

    public static final /* synthetic */ LinearLayout access$getMHeaderLayout$p(BaseQuickAdapter baseQuickAdapter) {
        LinearLayout linearLayout = baseQuickAdapter.mHeaderLayout;
        if (linearLayout == null) {
            l0.S(ProtectedSandApp.s("ุ"));
        }
        return linearLayout;
    }

    private final void addAnimation(RecyclerView.e0 holder) {
        if (this.animationEnable) {
            if (!this.isAnimationFirstOnly || holder.getLayoutPosition() > this.mLastPosition) {
                BaseAnimation baseAnimation = this.adapterAnimation;
                if (baseAnimation == null) {
                    baseAnimation = new AlphaInAnimation(0.0f, 1, null);
                }
                View view = holder.itemView;
                l0.h(view, ProtectedSandApp.s("ู"));
                for (Animator animator : baseAnimation.animators(view)) {
                    startAnim(animator, holder.getLayoutPosition());
                }
                this.mLastPosition = holder.getLayoutPosition();
            }
        }
    }

    public static /* synthetic */ int addFooterView$default(BaseQuickAdapter baseQuickAdapter, View view, int i4, int i5, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("ฺ"));
        }
        if ((i6 & 2) != 0) {
            i4 = -1;
        }
        if ((i6 & 4) != 0) {
            i5 = 1;
        }
        return baseQuickAdapter.addFooterView(view, i4, i5);
    }

    public static /* synthetic */ int addHeaderView$default(BaseQuickAdapter baseQuickAdapter, View view, int i4, int i5, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\u0e3b"));
        }
        if ((i6 & 2) != 0) {
            i4 = -1;
        }
        if ((i6 & 4) != 0) {
            i5 = 1;
        }
        return baseQuickAdapter.addHeaderView(view, i4, i5);
    }

    private final void checkModule() {
        if (this instanceof LoadMoreModule) {
            this.mLoadMoreModule = addLoadMoreModule(this);
        }
        if (this instanceof UpFetchModule) {
            this.mUpFetchModule = addUpFetchModule(this);
        }
        if (this instanceof DraggableModule) {
            this.mDraggableModule = addDraggableModule(this);
        }
    }

    private final VH createBaseGenericKInstance(Class<?> z4, View view) {
        try {
            boolean isMemberClass = z4.isMemberClass();
            String s4 = ProtectedSandApp.s("\u0e3c");
            if (!isMemberClass || Modifier.isStatic(z4.getModifiers())) {
                Constructor<?> declaredConstructor = z4.getDeclaredConstructor(View.class);
                l0.h(declaredConstructor, ProtectedSandApp.s("\u0e3e"));
                declaredConstructor.setAccessible(true);
                Object newInstance = declaredConstructor.newInstance(view);
                if (newInstance != null) {
                    return (VH) newInstance;
                }
                throw new TypeCastException(s4);
            }
            Constructor<?> declaredConstructor2 = z4.getDeclaredConstructor(getClass(), View.class);
            l0.h(declaredConstructor2, ProtectedSandApp.s("\u0e3d"));
            declaredConstructor2.setAccessible(true);
            Object newInstance2 = declaredConstructor2.newInstance(this, view);
            if (newInstance2 != null) {
                return (VH) newInstance2;
            }
            throw new TypeCastException(s4);
        } catch (IllegalAccessException e4) {
            e4.printStackTrace();
            return null;
        } catch (InstantiationException e5) {
            e5.printStackTrace();
            return null;
        } catch (NoSuchMethodException e6) {
            e6.printStackTrace();
            return null;
        } catch (InvocationTargetException e7) {
            e7.printStackTrace();
            return null;
        }
    }

    private final Class<?> getInstancedGenericKClass(Class<?> z4) {
        try {
            Type genericSuperclass = z4.getGenericSuperclass();
            if (!(genericSuperclass instanceof ParameterizedType)) {
                return null;
            }
            for (Type type : ((ParameterizedType) genericSuperclass).getActualTypeArguments()) {
                if (type instanceof Class) {
                    if (BaseViewHolder.class.isAssignableFrom((Class) type)) {
                        return (Class) type;
                    }
                } else if (type instanceof ParameterizedType) {
                    Type rawType = ((ParameterizedType) type).getRawType();
                    if ((rawType instanceof Class) && BaseViewHolder.class.isAssignableFrom((Class) rawType)) {
                        return (Class) rawType;
                    }
                } else {
                    continue;
                }
            }
            return null;
        } catch (TypeNotPresentException e4) {
            e4.printStackTrace();
            return null;
        } catch (GenericSignatureFormatError e5) {
            e5.printStackTrace();
            return null;
        } catch (MalformedParameterizedTypeException e6) {
            e6.printStackTrace();
            return null;
        }
    }

    public static /* synthetic */ int setFooterView$default(BaseQuickAdapter baseQuickAdapter, View view, int i4, int i5, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("฿"));
        }
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = 1;
        }
        return baseQuickAdapter.setFooterView(view, i4, i5);
    }

    public static /* synthetic */ int setHeaderView$default(BaseQuickAdapter baseQuickAdapter, View view, int i4, int i5, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("เ"));
        }
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = 1;
        }
        return baseQuickAdapter.setHeaderView(view, i4, i5);
    }

    @k(message = "Please use recyclerView", replaceWith = @x0(expression = "recyclerView", imports = {}))
    public static /* synthetic */ void weakRecyclerView$annotations() {
    }

    public final void addChildClickViewIds(@d0 @l int... viewIds) {
        l0.q(viewIds, ProtectedSandApp.s("แ"));
        for (int i4 : viewIds) {
            this.childClickViewIds.add(Integer.valueOf(i4));
        }
    }

    public final void addChildLongClickViewIds(@d0 @l int... viewIds) {
        l0.q(viewIds, ProtectedSandApp.s("แ"));
        for (int i4 : viewIds) {
            this.childLongClickViewIds.add(Integer.valueOf(i4));
        }
    }

    public void addData(@g0(from = 0) int position, T data) {
        this.data.add(position, data);
        notifyItemInserted(getHeaderLayoutCount() + position);
        compatibilityDataSizeChanged(1);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapterModuleImp
    @l
    public BaseDraggableModule addDraggableModule(@l BaseQuickAdapter<?, ?> baseQuickAdapter) {
        l0.q(baseQuickAdapter, ProtectedSandApp.s("ใ"));
        return BaseQuickAdapterModuleImp.DefaultImpls.addDraggableModule(this, baseQuickAdapter);
    }

    @j
    public final int addFooterView(@l View view) {
        return addFooterView$default(this, view, 0, 0, 6, null);
    }

    @j
    public final int addHeaderView(@l View view) {
        return addHeaderView$default(this, view, 0, 0, 6, null);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapterModuleImp
    @l
    public BaseLoadMoreModule addLoadMoreModule(@l BaseQuickAdapter<?, ?> baseQuickAdapter) {
        l0.q(baseQuickAdapter, ProtectedSandApp.s("ใ"));
        return BaseQuickAdapterModuleImp.DefaultImpls.addLoadMoreModule(this, baseQuickAdapter);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapterModuleImp
    @l
    public BaseUpFetchModule addUpFetchModule(@l BaseQuickAdapter<?, ?> baseQuickAdapter) {
        l0.q(baseQuickAdapter, ProtectedSandApp.s("ใ"));
        return BaseQuickAdapterModuleImp.DefaultImpls.addUpFetchModule(this, baseQuickAdapter);
    }

    protected void bindViewClickListener(@l final VH viewHolder, int viewType) {
        l0.q(viewHolder, ProtectedSandApp.s("ๅ"));
        if (this.mOnItemClickListener != null) {
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.chad.library.adapter.base.BaseQuickAdapter$bindViewClickListener$$inlined$let$lambda$1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int adapterPosition = viewHolder.getAdapterPosition();
                    if (adapterPosition == -1) {
                        return;
                    }
                    int headerLayoutCount = adapterPosition - BaseQuickAdapter.this.getHeaderLayoutCount();
                    BaseQuickAdapter baseQuickAdapter = BaseQuickAdapter.this;
                    l0.h(view, ProtectedSandApp.s("ຖ"));
                    baseQuickAdapter.setOnItemClick(view, headerLayoutCount);
                }
            });
        }
        if (this.mOnItemLongClickListener != null) {
            viewHolder.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.chad.library.adapter.base.BaseQuickAdapter$bindViewClickListener$$inlined$let$lambda$2
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    int adapterPosition = viewHolder.getAdapterPosition();
                    if (adapterPosition == -1) {
                        return false;
                    }
                    int headerLayoutCount = adapterPosition - BaseQuickAdapter.this.getHeaderLayoutCount();
                    BaseQuickAdapter baseQuickAdapter = BaseQuickAdapter.this;
                    l0.h(view, ProtectedSandApp.s("ທ"));
                    return baseQuickAdapter.setOnItemLongClick(view, headerLayoutCount);
                }
            });
        }
        OnItemChildClickListener onItemChildClickListener = this.mOnItemChildClickListener;
        String s4 = ProtectedSandApp.s("ๆ");
        if (onItemChildClickListener != null) {
            Iterator<Integer> it = getChildClickViewIds().iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                View view = viewHolder.itemView;
                l0.h(next, s4);
                View findViewById = view.findViewById(next.intValue());
                if (findViewById != null) {
                    if (!findViewById.isClickable()) {
                        findViewById.setClickable(true);
                    }
                    findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.chad.library.adapter.base.BaseQuickAdapter$bindViewClickListener$$inlined$let$lambda$3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int adapterPosition = viewHolder.getAdapterPosition();
                            if (adapterPosition == -1) {
                                return;
                            }
                            int headerLayoutCount = adapterPosition - BaseQuickAdapter.this.getHeaderLayoutCount();
                            BaseQuickAdapter baseQuickAdapter = BaseQuickAdapter.this;
                            l0.h(view2, ProtectedSandApp.s("ຘ"));
                            baseQuickAdapter.setOnItemChildClick(view2, headerLayoutCount);
                        }
                    });
                }
            }
        }
        if (this.mOnItemChildLongClickListener != null) {
            Iterator<Integer> it2 = getChildLongClickViewIds().iterator();
            while (it2.hasNext()) {
                Integer next2 = it2.next();
                View view2 = viewHolder.itemView;
                l0.h(next2, s4);
                View findViewById2 = view2.findViewById(next2.intValue());
                if (findViewById2 != null) {
                    if (!findViewById2.isLongClickable()) {
                        findViewById2.setLongClickable(true);
                    }
                    findViewById2.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.chad.library.adapter.base.BaseQuickAdapter$bindViewClickListener$$inlined$let$lambda$4
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View view3) {
                            int adapterPosition = viewHolder.getAdapterPosition();
                            if (adapterPosition == -1) {
                                return false;
                            }
                            int headerLayoutCount = adapterPosition - BaseQuickAdapter.this.getHeaderLayoutCount();
                            BaseQuickAdapter baseQuickAdapter = BaseQuickAdapter.this;
                            l0.h(view3, ProtectedSandApp.s("ນ"));
                            return baseQuickAdapter.setOnItemChildLongClick(view3, headerLayoutCount);
                        }
                    });
                }
            }
        }
    }

    protected final void compatibilityDataSizeChanged(int size) {
        if (this.data.size() == size) {
            notifyDataSetChanged();
        }
    }

    protected abstract void convert(@l VH holder, T item);

    protected void convert(@l VH holder, T item, @l List<? extends Object> payloads) {
        l0.q(holder, ProtectedSandApp.s("็"));
        l0.q(payloads, ProtectedSandApp.s("่"));
    }

    @l
    protected VH createBaseViewHolder(@l ViewGroup parent, @j0 int layoutResId) {
        l0.q(parent, ProtectedSandApp.s("้"));
        return createBaseViewHolder(AdapterUtilsKt.getItemView(parent, layoutResId));
    }

    @m
    public final BaseAnimation getAdapterAnimation() {
        return this.adapterAnimation;
    }

    public final boolean getAnimationEnable() {
        return this.animationEnable;
    }

    @l
    public final LinkedHashSet<Integer> getChildClickViewIds() {
        return this.childClickViewIds;
    }

    @l
    public final LinkedHashSet<Integer> getChildLongClickViewIds() {
        return this.childLongClickViewIds;
    }

    @l
    protected final Context getContext() {
        Context context = this.context;
        if (context == null) {
            l0.S(ProtectedSandApp.s("๊"));
        }
        return context;
    }

    @l
    public final List<T> getData() {
        return this.data;
    }

    protected int getDefItemCount() {
        return this.data.size();
    }

    protected int getDefItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @l
    @k(message = "User getDiffer()", replaceWith = @x0(expression = "getDiffer()", imports = {}))
    public final BrvahAsyncDiffer<T> getDiffHelper() {
        return getDiffer();
    }

    @l
    public final BrvahAsyncDiffer<T> getDiffer() {
        BrvahAsyncDiffer<T> brvahAsyncDiffer = this.mDiffHelper;
        if (brvahAsyncDiffer == null) {
            throw new IllegalStateException(ProtectedSandApp.s("๋"));
        }
        if (brvahAsyncDiffer == null) {
            l0.L();
        }
        return brvahAsyncDiffer;
    }

    @l
    public final BaseDraggableModule getDraggableModule() {
        BaseDraggableModule baseDraggableModule = this.mDraggableModule;
        if (baseDraggableModule == null) {
            throw new IllegalStateException(ProtectedSandApp.s("์"));
        }
        if (baseDraggableModule == null) {
            l0.L();
        }
        return baseDraggableModule;
    }

    @m
    public final FrameLayout getEmptyLayout() {
        FrameLayout frameLayout = this.mEmptyLayout;
        if (frameLayout == null) {
            return null;
        }
        if (frameLayout != null) {
            return frameLayout;
        }
        l0.S(ProtectedSandApp.s("ึ"));
        return frameLayout;
    }

    @m
    public final LinearLayout getFooterLayout() {
        LinearLayout linearLayout = this.mFooterLayout;
        if (linearLayout == null) {
            return null;
        }
        if (linearLayout != null) {
            return linearLayout;
        }
        l0.S(ProtectedSandApp.s("ื"));
        return linearLayout;
    }

    public final int getFooterLayoutCount() {
        return hasFooterLayout() ? 1 : 0;
    }

    public final boolean getFooterViewAsFlow() {
        return this.footerViewAsFlow;
    }

    public final int getFooterViewPosition() {
        if (!hasEmptyView()) {
            return this.data.size() + getHeaderLayoutCount();
        }
        int i4 = (this.headerWithEmptyEnable && hasHeaderLayout()) ? 2 : 1;
        if (this.footerWithEmptyEnable) {
            return i4;
        }
        return -1;
    }

    public final boolean getFooterWithEmptyEnable() {
        return this.footerWithEmptyEnable;
    }

    @m
    public final LinearLayout getHeaderLayout() {
        LinearLayout linearLayout = this.mHeaderLayout;
        if (linearLayout == null) {
            return null;
        }
        if (linearLayout != null) {
            return linearLayout;
        }
        l0.S(ProtectedSandApp.s("ุ"));
        return linearLayout;
    }

    public final int getHeaderLayoutCount() {
        return hasHeaderLayout() ? 1 : 0;
    }

    public final boolean getHeaderViewAsFlow() {
        return this.headerViewAsFlow;
    }

    public final int getHeaderViewPosition() {
        return (!hasEmptyView() || this.headerWithEmptyEnable) ? 0 : -1;
    }

    public final boolean getHeaderWithEmptyEnable() {
        return this.headerWithEmptyEnable;
    }

    public T getItem(@g0(from = 0) int position) {
        return this.data.get(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        if (!hasEmptyView()) {
            BaseLoadMoreModule baseLoadMoreModule = this.mLoadMoreModule;
            return getFooterLayoutCount() + getHeaderLayoutCount() + getDefItemCount() + ((baseLoadMoreModule == null || !baseLoadMoreModule.hasLoadMoreView()) ? 0 : 1);
        }
        if (this.headerWithEmptyEnable && hasHeaderLayout()) {
            r1 = 2;
        }
        return (this.footerWithEmptyEnable && hasFooterLayout()) ? r1 + 1 : r1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int position) {
        return position;
    }

    @m
    public T getItemOrNull(@g0(from = 0) int position) {
        return (T) w.W2(this.data, position);
    }

    public int getItemPosition(@m T item) {
        if (item == null || this.data.isEmpty()) {
            return -1;
        }
        return this.data.indexOf(item);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int position) {
        if (hasEmptyView()) {
            boolean z4 = this.headerWithEmptyEnable && hasHeaderLayout();
            if (position != 0) {
                return position != 1 ? FOOTER_VIEW : FOOTER_VIEW;
            }
            if (z4) {
                return HEADER_VIEW;
            }
            return EMPTY_VIEW;
        }
        boolean hasHeaderLayout = hasHeaderLayout();
        if (hasHeaderLayout && position == 0) {
            return HEADER_VIEW;
        }
        if (hasHeaderLayout) {
            position--;
        }
        int size = this.data.size();
        return position < size ? getDefItemViewType(position) : position - size < hasFooterLayout() ? FOOTER_VIEW : LOAD_MORE_VIEW;
    }

    @l
    public final BaseLoadMoreModule getLoadMoreModule() {
        BaseLoadMoreModule baseLoadMoreModule = this.mLoadMoreModule;
        if (baseLoadMoreModule == null) {
            throw new IllegalStateException(ProtectedSandApp.s("ํ"));
        }
        if (baseLoadMoreModule == null) {
            l0.L();
        }
        return baseLoadMoreModule;
    }

    @m
    /* renamed from: getMLoadMoreModule$com_github_CymChad_brvah, reason: from getter */
    public final BaseLoadMoreModule getMLoadMoreModule() {
        return this.mLoadMoreModule;
    }

    @m
    /* renamed from: getMRecyclerView$com_github_CymChad_brvah, reason: from getter */
    public final RecyclerView getMRecyclerView() {
        return this.mRecyclerView;
    }

    @m
    /* renamed from: getOnItemChildClickListener, reason: from getter */
    public final OnItemChildClickListener getMOnItemChildClickListener() {
        return this.mOnItemChildClickListener;
    }

    @m
    /* renamed from: getOnItemChildLongClickListener, reason: from getter */
    public final OnItemChildLongClickListener getMOnItemChildLongClickListener() {
        return this.mOnItemChildLongClickListener;
    }

    @m
    /* renamed from: getOnItemClickListener, reason: from getter */
    public final OnItemClickListener getMOnItemClickListener() {
        return this.mOnItemClickListener;
    }

    @m
    /* renamed from: getOnItemLongClickListener, reason: from getter */
    public final OnItemLongClickListener getMOnItemLongClickListener() {
        return this.mOnItemLongClickListener;
    }

    @l
    public final RecyclerView getRecyclerView() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            throw new IllegalStateException(ProtectedSandApp.s("๎"));
        }
        if (recyclerView == null) {
            l0.L();
        }
        return recyclerView;
    }

    @l
    public final BaseUpFetchModule getUpFetchModule() {
        BaseUpFetchModule baseUpFetchModule = this.mUpFetchModule;
        if (baseUpFetchModule == null) {
            throw new IllegalStateException(ProtectedSandApp.s("๏"));
        }
        if (baseUpFetchModule == null) {
            l0.L();
        }
        return baseUpFetchModule;
    }

    @m
    public final View getViewByPosition(int position, @d0 int viewId) {
        BaseViewHolder baseViewHolder;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (baseViewHolder = (BaseViewHolder) recyclerView.findViewHolderForLayoutPosition(position)) == null) {
            return null;
        }
        return baseViewHolder.getViewOrNull(viewId);
    }

    @l
    public final WeakReference<RecyclerView> getWeakRecyclerView() {
        WeakReference<RecyclerView> weakReference = this.weakRecyclerView;
        if (weakReference == null) {
            l0.S(ProtectedSandApp.s("๐"));
        }
        return weakReference;
    }

    public final boolean hasEmptyView() {
        FrameLayout frameLayout = this.mEmptyLayout;
        if (frameLayout != null) {
            if (frameLayout == null) {
                l0.S(ProtectedSandApp.s("ึ"));
            }
            if (frameLayout.getChildCount() != 0 && this.isUseEmpty) {
                return this.data.isEmpty();
            }
            return false;
        }
        return false;
    }

    public final boolean hasFooterLayout() {
        LinearLayout linearLayout = this.mFooterLayout;
        if (linearLayout == null) {
            return false;
        }
        if (linearLayout == null) {
            l0.S(ProtectedSandApp.s("ื"));
        }
        return linearLayout.getChildCount() > 0;
    }

    public final boolean hasHeaderLayout() {
        LinearLayout linearLayout = this.mHeaderLayout;
        if (linearLayout == null) {
            return false;
        }
        if (linearLayout == null) {
            l0.S(ProtectedSandApp.s("ุ"));
        }
        return linearLayout.getChildCount() > 0;
    }

    /* renamed from: isAnimationFirstOnly, reason: from getter */
    public final boolean getIsAnimationFirstOnly() {
        return this.isAnimationFirstOnly;
    }

    protected boolean isFixedViewType(int type) {
        return type == 268436821 || type == 268435729 || type == 268436275 || type == 268436002;
    }

    /* renamed from: isUseEmpty, reason: from getter */
    public final boolean getIsUseEmpty() {
        return this.isUseEmpty;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onAttachedToRecyclerView(@l RecyclerView recyclerView) {
        l0.q(recyclerView, ProtectedSandApp.s("๑"));
        super.onAttachedToRecyclerView(recyclerView);
        this.weakRecyclerView = new WeakReference<>(recyclerView);
        this.mRecyclerView = recyclerView;
        Context context = recyclerView.getContext();
        l0.h(context, ProtectedSandApp.s("๒"));
        this.context = context;
        BaseDraggableModule baseDraggableModule = this.mDraggableModule;
        if (baseDraggableModule != null) {
            baseDraggableModule.attachToRecyclerView(recyclerView);
        }
        final RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            final GridLayoutManager.b Q = gridLayoutManager.Q();
            gridLayoutManager.W(new GridLayoutManager.b() { // from class: com.chad.library.adapter.base.BaseQuickAdapter$onAttachedToRecyclerView$1
                @Override // androidx.recyclerview.widget.GridLayoutManager.b
                public int getSpanSize(int position) {
                    GridSpanSizeLookup gridSpanSizeLookup;
                    GridSpanSizeLookup gridSpanSizeLookup2;
                    int itemViewType = BaseQuickAdapter.this.getItemViewType(position);
                    if (itemViewType == 268435729 && BaseQuickAdapter.this.getHeaderViewAsFlow()) {
                        return 1;
                    }
                    if (itemViewType == 268436275 && BaseQuickAdapter.this.getFooterViewAsFlow()) {
                        return 1;
                    }
                    gridSpanSizeLookup = BaseQuickAdapter.this.mSpanSizeLookup;
                    if (gridSpanSizeLookup == null) {
                        return BaseQuickAdapter.this.isFixedViewType(itemViewType) ? ((GridLayoutManager) layoutManager).M() : Q.getSpanSize(position);
                    }
                    if (BaseQuickAdapter.this.isFixedViewType(itemViewType)) {
                        return ((GridLayoutManager) layoutManager).M();
                    }
                    gridSpanSizeLookup2 = BaseQuickAdapter.this.mSpanSizeLookup;
                    if (gridSpanSizeLookup2 == null) {
                        l0.L();
                    }
                    return gridSpanSizeLookup2.getSpanSize((GridLayoutManager) layoutManager, itemViewType, position - BaseQuickAdapter.this.getHeaderLayoutCount());
                }
            });
        }
    }

    @l
    protected VH onCreateDefViewHolder(@l ViewGroup parent, int viewType) {
        l0.q(parent, ProtectedSandApp.s("้"));
        return createBaseViewHolder(parent, this.layoutResId);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onDetachedFromRecyclerView(@l RecyclerView recyclerView) {
        l0.q(recyclerView, ProtectedSandApp.s("๑"));
        super.onDetachedFromRecyclerView(recyclerView);
        this.mRecyclerView = null;
    }

    protected void onItemViewHolderCreated(@l VH viewHolder, int viewType) {
        l0.q(viewHolder, ProtectedSandApp.s("ๅ"));
    }

    @k(message = "Please use removeAt()", replaceWith = @x0(expression = "removeAt(position)", imports = {}))
    public void remove(@g0(from = 0) int position) {
        removeAt(position);
    }

    public final void removeAllFooterView() {
        if (hasFooterLayout()) {
            LinearLayout linearLayout = this.mFooterLayout;
            if (linearLayout == null) {
                l0.S(ProtectedSandApp.s("ื"));
            }
            linearLayout.removeAllViews();
            int footerViewPosition = getFooterViewPosition();
            if (footerViewPosition != -1) {
                notifyItemRemoved(footerViewPosition);
            }
        }
    }

    public final void removeAllHeaderView() {
        if (hasHeaderLayout()) {
            LinearLayout linearLayout = this.mHeaderLayout;
            if (linearLayout == null) {
                l0.S(ProtectedSandApp.s("ุ"));
            }
            linearLayout.removeAllViews();
            int headerViewPosition = getHeaderViewPosition();
            if (headerViewPosition != -1) {
                notifyItemRemoved(headerViewPosition);
            }
        }
    }

    public void removeAt(@g0(from = 0) int position) {
        if (position >= this.data.size()) {
            return;
        }
        this.data.remove(position);
        int headerLayoutCount = getHeaderLayoutCount() + position;
        notifyItemRemoved(headerLayoutCount);
        compatibilityDataSizeChanged(0);
        notifyItemRangeChanged(headerLayoutCount, this.data.size() - headerLayoutCount);
    }

    public final void removeEmptyView() {
        FrameLayout frameLayout = this.mEmptyLayout;
        if (frameLayout != null) {
            if (frameLayout == null) {
                l0.S(ProtectedSandApp.s("ึ"));
            }
            frameLayout.removeAllViews();
        }
    }

    public final void removeFooterView(@l View footer) {
        int footerViewPosition;
        l0.q(footer, ProtectedSandApp.s("๓"));
        if (hasFooterLayout()) {
            LinearLayout linearLayout = this.mFooterLayout;
            String s4 = ProtectedSandApp.s("ื");
            if (linearLayout == null) {
                l0.S(s4);
            }
            linearLayout.removeView(footer);
            LinearLayout linearLayout2 = this.mFooterLayout;
            if (linearLayout2 == null) {
                l0.S(s4);
            }
            if (linearLayout2.getChildCount() != 0 || (footerViewPosition = getFooterViewPosition()) == -1) {
                return;
            }
            notifyItemRemoved(footerViewPosition);
        }
    }

    public final void removeHeaderView(@l View header) {
        int headerViewPosition;
        l0.q(header, ProtectedSandApp.s("๔"));
        if (hasHeaderLayout()) {
            LinearLayout linearLayout = this.mHeaderLayout;
            String s4 = ProtectedSandApp.s("ุ");
            if (linearLayout == null) {
                l0.S(s4);
            }
            linearLayout.removeView(header);
            LinearLayout linearLayout2 = this.mHeaderLayout;
            if (linearLayout2 == null) {
                l0.S(s4);
            }
            if (linearLayout2.getChildCount() != 0 || (headerViewPosition = getHeaderViewPosition()) == -1) {
                return;
            }
            notifyItemRemoved(headerViewPosition);
        }
    }

    @k(message = "Please use setData()", replaceWith = @x0(expression = "setData(newData)", imports = {}))
    public void replaceData(@l Collection<? extends T> newData) {
        l0.q(newData, ProtectedSandApp.s("โ"));
        setList(newData);
    }

    public final void setAdapterAnimation(@m BaseAnimation baseAnimation) {
        this.animationEnable = true;
        this.adapterAnimation = baseAnimation;
    }

    public final void setAnimationEnable(boolean z4) {
        this.animationEnable = z4;
    }

    public final void setAnimationFirstOnly(boolean z4) {
        this.isAnimationFirstOnly = z4;
    }

    public final void setAnimationWithDefault(@l AnimationType animationType) {
        BaseAnimation alphaInAnimation;
        l0.q(animationType, ProtectedSandApp.s("๕"));
        int i4 = WhenMappings.$EnumSwitchMapping$0[animationType.ordinal()];
        kotlin.jvm.internal.w wVar = null;
        float f4 = 0.0f;
        int i5 = 1;
        if (i4 == 1) {
            alphaInAnimation = new AlphaInAnimation(f4, i5, wVar);
        } else if (i4 == 2) {
            alphaInAnimation = new ScaleInAnimation(f4, i5, wVar);
        } else if (i4 == 3) {
            alphaInAnimation = new SlideInBottomAnimation();
        } else if (i4 == 4) {
            alphaInAnimation = new SlideInLeftAnimation();
        } else {
            if (i4 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            alphaInAnimation = new SlideInRightAnimation();
        }
        setAdapterAnimation(alphaInAnimation);
    }

    public void setData(@g0(from = 0) int index, T data) {
        if (index >= this.data.size()) {
            return;
        }
        this.data.set(index, data);
        notifyItemChanged(getHeaderLayoutCount() + index);
    }

    public final void setData$com_github_CymChad_brvah(@l List<T> list) {
        l0.q(list, ProtectedSandApp.s("๖"));
        this.data = list;
    }

    public final void setDiffCallback(@l k.f<T> diffCallback) {
        l0.q(diffCallback, ProtectedSandApp.s("๗"));
        setDiffConfig(new BrvahAsyncDifferConfig.Builder(diffCallback).build());
    }

    public final void setDiffConfig(@l BrvahAsyncDifferConfig<T> config) {
        l0.q(config, ProtectedSandApp.s("๘"));
        this.mDiffHelper = new BrvahAsyncDiffer<>(this, config);
    }

    public void setDiffNewData(@m List<T> list) {
        if (hasEmptyView()) {
            setNewInstance(list);
            return;
        }
        BrvahAsyncDiffer<T> brvahAsyncDiffer = this.mDiffHelper;
        if (brvahAsyncDiffer != null) {
            BrvahAsyncDiffer.submitList$default(brvahAsyncDiffer, list, null, 2, null);
        }
    }

    public final void setEmptyView(@l View emptyView) {
        boolean z4;
        l0.q(emptyView, ProtectedSandApp.s("๛"));
        int itemCount = getItemCount();
        FrameLayout frameLayout = this.mEmptyLayout;
        String s4 = ProtectedSandApp.s("ึ");
        if (frameLayout == null) {
            FrameLayout frameLayout2 = new FrameLayout(emptyView.getContext());
            this.mEmptyLayout = frameLayout2;
            ViewGroup.LayoutParams layoutParams = emptyView.getLayoutParams();
            frameLayout2.setLayoutParams(layoutParams != null ? new ViewGroup.LayoutParams(layoutParams.width, layoutParams.height) : new ViewGroup.LayoutParams(-1, -1));
            z4 = true;
        } else {
            ViewGroup.LayoutParams layoutParams2 = emptyView.getLayoutParams();
            if (layoutParams2 != null) {
                FrameLayout frameLayout3 = this.mEmptyLayout;
                if (frameLayout3 == null) {
                    l0.S(s4);
                }
                ViewGroup.LayoutParams layoutParams3 = frameLayout3.getLayoutParams();
                layoutParams3.width = layoutParams2.width;
                layoutParams3.height = layoutParams2.height;
                FrameLayout frameLayout4 = this.mEmptyLayout;
                if (frameLayout4 == null) {
                    l0.S(s4);
                }
                frameLayout4.setLayoutParams(layoutParams3);
            }
            z4 = false;
        }
        FrameLayout frameLayout5 = this.mEmptyLayout;
        if (frameLayout5 == null) {
            l0.S(s4);
        }
        frameLayout5.removeAllViews();
        FrameLayout frameLayout6 = this.mEmptyLayout;
        if (frameLayout6 == null) {
            l0.S(s4);
        }
        frameLayout6.addView(emptyView);
        this.isUseEmpty = true;
        if (z4 && hasEmptyView()) {
            int i4 = (this.headerWithEmptyEnable && hasHeaderLayout()) ? 1 : 0;
            if (getItemCount() > itemCount) {
                notifyItemInserted(i4);
            } else {
                notifyDataSetChanged();
            }
        }
    }

    @j
    public final int setFooterView(@l View view) {
        return setFooterView$default(this, view, 0, 0, 6, null);
    }

    public final void setFooterViewAsFlow(boolean z4) {
        this.footerViewAsFlow = z4;
    }

    public final void setFooterWithEmptyEnable(boolean z4) {
        this.footerWithEmptyEnable = z4;
    }

    protected void setFullSpan(@l RecyclerView.e0 holder) {
        l0.q(holder, ProtectedSandApp.s("็"));
        View view = holder.itemView;
        l0.h(view, ProtectedSandApp.s("ู"));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).o(true);
        }
    }

    @Override // com.chad.library.adapter.base.listener.BaseListenerImp
    public void setGridSpanSizeLookup(@m GridSpanSizeLookup spanSizeLookup) {
        this.mSpanSizeLookup = spanSizeLookup;
    }

    @j
    public final int setHeaderView(@l View view) {
        return setHeaderView$default(this, view, 0, 0, 6, null);
    }

    public final void setHeaderViewAsFlow(boolean z4) {
        this.headerViewAsFlow = z4;
    }

    public final void setHeaderWithEmptyEnable(boolean z4) {
        this.headerWithEmptyEnable = z4;
    }

    public void setList(@m Collection<? extends T> list) {
        List<T> list2 = this.data;
        if (list != list2) {
            list2.clear();
            if (list != null && !list.isEmpty()) {
                this.data.addAll(list);
            }
        } else if (list == null || list.isEmpty()) {
            this.data.clear();
        } else {
            ArrayList arrayList = new ArrayList(list);
            this.data.clear();
            this.data.addAll(arrayList);
        }
        BaseLoadMoreModule baseLoadMoreModule = this.mLoadMoreModule;
        if (baseLoadMoreModule != null) {
            baseLoadMoreModule.reset$com_github_CymChad_brvah();
        }
        this.mLastPosition = -1;
        notifyDataSetChanged();
        BaseLoadMoreModule baseLoadMoreModule2 = this.mLoadMoreModule;
        if (baseLoadMoreModule2 != null) {
            baseLoadMoreModule2.checkDisableLoadMoreIfNotFullPage();
        }
    }

    public final void setMLoadMoreModule$com_github_CymChad_brvah(@m BaseLoadMoreModule baseLoadMoreModule) {
        this.mLoadMoreModule = baseLoadMoreModule;
    }

    public final void setMRecyclerView$com_github_CymChad_brvah(@m RecyclerView recyclerView) {
        this.mRecyclerView = recyclerView;
    }

    @kotlin.k(message = "Please use setNewInstance(), This method will be removed in the next version", replaceWith = @x0(expression = "setNewInstance(data)", imports = {}))
    public void setNewData(@m List<T> data) {
        setNewInstance(data);
    }

    public void setNewInstance(@m List<T> list) {
        if (list == this.data) {
            return;
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        this.data = list;
        BaseLoadMoreModule baseLoadMoreModule = this.mLoadMoreModule;
        if (baseLoadMoreModule != null) {
            baseLoadMoreModule.reset$com_github_CymChad_brvah();
        }
        this.mLastPosition = -1;
        notifyDataSetChanged();
        BaseLoadMoreModule baseLoadMoreModule2 = this.mLoadMoreModule;
        if (baseLoadMoreModule2 != null) {
            baseLoadMoreModule2.checkDisableLoadMoreIfNotFullPage();
        }
    }

    protected void setOnItemChildClick(@l View v4, int position) {
        l0.q(v4, ProtectedSandApp.s("\u0e5c"));
        OnItemChildClickListener onItemChildClickListener = this.mOnItemChildClickListener;
        if (onItemChildClickListener != null) {
            onItemChildClickListener.onItemChildClick(this, v4, position);
        }
    }

    @Override // com.chad.library.adapter.base.listener.BaseListenerImp
    public void setOnItemChildClickListener(@m OnItemChildClickListener listener) {
        this.mOnItemChildClickListener = listener;
    }

    protected boolean setOnItemChildLongClick(@l View v4, int position) {
        l0.q(v4, ProtectedSandApp.s("\u0e5c"));
        OnItemChildLongClickListener onItemChildLongClickListener = this.mOnItemChildLongClickListener;
        if (onItemChildLongClickListener != null) {
            return onItemChildLongClickListener.onItemChildLongClick(this, v4, position);
        }
        return false;
    }

    @Override // com.chad.library.adapter.base.listener.BaseListenerImp
    public void setOnItemChildLongClickListener(@m OnItemChildLongClickListener listener) {
        this.mOnItemChildLongClickListener = listener;
    }

    protected void setOnItemClick(@l View v4, int position) {
        l0.q(v4, ProtectedSandApp.s("\u0e5c"));
        OnItemClickListener onItemClickListener = this.mOnItemClickListener;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(this, v4, position);
        }
    }

    @Override // com.chad.library.adapter.base.listener.BaseListenerImp
    public void setOnItemClickListener(@m OnItemClickListener listener) {
        this.mOnItemClickListener = listener;
    }

    protected boolean setOnItemLongClick(@l View v4, int position) {
        l0.q(v4, ProtectedSandApp.s("\u0e5c"));
        OnItemLongClickListener onItemLongClickListener = this.mOnItemLongClickListener;
        if (onItemLongClickListener != null) {
            return onItemLongClickListener.onItemLongClick(this, v4, position);
        }
        return false;
    }

    @Override // com.chad.library.adapter.base.listener.BaseListenerImp
    public void setOnItemLongClickListener(@m OnItemLongClickListener listener) {
        this.mOnItemLongClickListener = listener;
    }

    public final void setRecyclerView(@l RecyclerView recyclerView) {
        l0.q(recyclerView, ProtectedSandApp.s("\u0e5d"));
        this.mRecyclerView = recyclerView;
    }

    public final void setUseEmpty(boolean z4) {
        this.isUseEmpty = z4;
    }

    public final void setWeakRecyclerView(@l WeakReference<RecyclerView> weakReference) {
        l0.q(weakReference, ProtectedSandApp.s("๖"));
        this.weakRecyclerView = weakReference;
    }

    protected void startAnim(@l Animator anim, int index) {
        l0.q(anim, ProtectedSandApp.s("\u0e5e"));
        anim.start();
    }

    public /* synthetic */ BaseQuickAdapter(int i4, List list, int i5, kotlin.jvm.internal.w wVar) {
        this(i4, (i5 & 2) != 0 ? null : list);
    }

    @j
    public final int addFooterView(@l View view, int i4) {
        return addFooterView$default(this, view, i4, 0, 4, null);
    }

    @j
    public final int addHeaderView(@l View view, int i4) {
        return addHeaderView$default(this, view, i4, 0, 4, null);
    }

    @l
    protected VH createBaseViewHolder(@l View view) {
        l0.q(view, ProtectedSandApp.s("ไ"));
        Class<?> cls = null;
        for (Class<?> cls2 = getClass(); cls == null && cls2 != null; cls2 = cls2.getSuperclass()) {
            cls = getInstancedGenericKClass(cls2);
        }
        VH createBaseGenericKInstance = cls == null ? (VH) new BaseViewHolder(view) : createBaseGenericKInstance(cls, view);
        return createBaseGenericKInstance != null ? createBaseGenericKInstance : (VH) new BaseViewHolder(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.e0 e0Var, int i4, List list) {
        onBindViewHolder((BaseQuickAdapter<T, VH>) e0Var, i4, (List<Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @l
    public VH onCreateViewHolder(@l ViewGroup parent, int viewType) {
        l0.q(parent, ProtectedSandApp.s("้"));
        switch (viewType) {
            case HEADER_VIEW /* 268435729 */:
                LinearLayout linearLayout = this.mHeaderLayout;
                String s4 = ProtectedSandApp.s("ุ");
                if (linearLayout == null) {
                    l0.S(s4);
                }
                ViewParent parent2 = linearLayout.getParent();
                if (parent2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent2;
                    LinearLayout linearLayout2 = this.mHeaderLayout;
                    if (linearLayout2 == null) {
                        l0.S(s4);
                    }
                    viewGroup.removeView(linearLayout2);
                }
                LinearLayout linearLayout3 = this.mHeaderLayout;
                if (linearLayout3 == null) {
                    l0.S(s4);
                }
                return createBaseViewHolder(linearLayout3);
            case LOAD_MORE_VIEW /* 268436002 */:
                BaseLoadMoreModule baseLoadMoreModule = this.mLoadMoreModule;
                if (baseLoadMoreModule == null) {
                    l0.L();
                }
                VH createBaseViewHolder = createBaseViewHolder(baseLoadMoreModule.getLoadMoreView().getRootView(parent));
                BaseLoadMoreModule baseLoadMoreModule2 = this.mLoadMoreModule;
                if (baseLoadMoreModule2 == null) {
                    l0.L();
                }
                baseLoadMoreModule2.setupViewHolder$com_github_CymChad_brvah(createBaseViewHolder);
                return createBaseViewHolder;
            case FOOTER_VIEW /* 268436275 */:
                LinearLayout linearLayout4 = this.mFooterLayout;
                String s5 = ProtectedSandApp.s("ื");
                if (linearLayout4 == null) {
                    l0.S(s5);
                }
                ViewParent parent3 = linearLayout4.getParent();
                if (parent3 instanceof ViewGroup) {
                    ViewGroup viewGroup2 = (ViewGroup) parent3;
                    LinearLayout linearLayout5 = this.mFooterLayout;
                    if (linearLayout5 == null) {
                        l0.S(s5);
                    }
                    viewGroup2.removeView(linearLayout5);
                }
                LinearLayout linearLayout6 = this.mFooterLayout;
                if (linearLayout6 == null) {
                    l0.S(s5);
                }
                return createBaseViewHolder(linearLayout6);
            case EMPTY_VIEW /* 268436821 */:
                FrameLayout frameLayout = this.mEmptyLayout;
                String s6 = ProtectedSandApp.s("ึ");
                if (frameLayout == null) {
                    l0.S(s6);
                }
                ViewParent parent4 = frameLayout.getParent();
                if (parent4 instanceof ViewGroup) {
                    ViewGroup viewGroup3 = (ViewGroup) parent4;
                    FrameLayout frameLayout2 = this.mEmptyLayout;
                    if (frameLayout2 == null) {
                        l0.S(s6);
                    }
                    viewGroup3.removeView(frameLayout2);
                }
                FrameLayout frameLayout3 = this.mEmptyLayout;
                if (frameLayout3 == null) {
                    l0.S(s6);
                }
                return createBaseViewHolder(frameLayout3);
            default:
                VH onCreateDefViewHolder = onCreateDefViewHolder(parent, viewType);
                bindViewClickListener(onCreateDefViewHolder, viewType);
                BaseDraggableModule baseDraggableModule = this.mDraggableModule;
                if (baseDraggableModule != null) {
                    baseDraggableModule.initView$com_github_CymChad_brvah(onCreateDefViewHolder);
                }
                onItemViewHolderCreated(onCreateDefViewHolder, viewType);
                return onCreateDefViewHolder;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewAttachedToWindow(@l VH holder) {
        l0.q(holder, ProtectedSandApp.s("็"));
        super.onViewAttachedToWindow((BaseQuickAdapter<T, VH>) holder);
        if (isFixedViewType(holder.getItemViewType())) {
            setFullSpan(holder);
        } else {
            addAnimation(holder);
        }
    }

    public void remove(T data) {
        int indexOf = this.data.indexOf(data);
        if (indexOf == -1) {
            return;
        }
        removeAt(indexOf);
    }

    @j
    public final int setFooterView(@l View view, int i4) {
        return setFooterView$default(this, view, i4, 0, 4, null);
    }

    @j
    public final int setHeaderView(@l View view, int i4) {
        return setHeaderView$default(this, view, i4, 0, 4, null);
    }

    @j
    public BaseQuickAdapter(@j0 int i4, @m List<T> list) {
        this.layoutResId = i4;
        this.data = list == null ? new ArrayList<>() : list;
        this.isUseEmpty = true;
        this.isAnimationFirstOnly = true;
        this.mLastPosition = -1;
        checkModule();
        this.childClickViewIds = new LinkedHashSet<>();
        this.childLongClickViewIds = new LinkedHashSet<>();
    }

    @j
    public final int addFooterView(@l View view, int index, int orientation) {
        int footerViewPosition;
        RecyclerView.LayoutParams layoutParams;
        l0.q(view, ProtectedSandApp.s("ไ"));
        LinearLayout linearLayout = this.mFooterLayout;
        String s4 = ProtectedSandApp.s("ื");
        if (linearLayout == null) {
            LinearLayout linearLayout2 = new LinearLayout(view.getContext());
            this.mFooterLayout = linearLayout2;
            linearLayout2.setOrientation(orientation);
            LinearLayout linearLayout3 = this.mFooterLayout;
            if (linearLayout3 == null) {
                l0.S(s4);
            }
            if (orientation == 1) {
                layoutParams = new RecyclerView.LayoutParams(-1, -2);
            } else {
                layoutParams = new RecyclerView.LayoutParams(-2, -1);
            }
            linearLayout3.setLayoutParams(layoutParams);
        }
        LinearLayout linearLayout4 = this.mFooterLayout;
        if (linearLayout4 == null) {
            l0.S(s4);
        }
        int childCount = linearLayout4.getChildCount();
        if (index < 0 || index > childCount) {
            index = childCount;
        }
        LinearLayout linearLayout5 = this.mFooterLayout;
        if (linearLayout5 == null) {
            l0.S(s4);
        }
        linearLayout5.addView(view, index);
        LinearLayout linearLayout6 = this.mFooterLayout;
        if (linearLayout6 == null) {
            l0.S(s4);
        }
        if (linearLayout6.getChildCount() == 1 && (footerViewPosition = getFooterViewPosition()) != -1) {
            notifyItemInserted(footerViewPosition);
        }
        return index;
    }

    @j
    public final int addHeaderView(@l View view, int index, int orientation) {
        int headerViewPosition;
        RecyclerView.LayoutParams layoutParams;
        l0.q(view, ProtectedSandApp.s("ไ"));
        LinearLayout linearLayout = this.mHeaderLayout;
        String s4 = ProtectedSandApp.s("ุ");
        if (linearLayout == null) {
            LinearLayout linearLayout2 = new LinearLayout(view.getContext());
            this.mHeaderLayout = linearLayout2;
            linearLayout2.setOrientation(orientation);
            LinearLayout linearLayout3 = this.mHeaderLayout;
            if (linearLayout3 == null) {
                l0.S(s4);
            }
            if (orientation == 1) {
                layoutParams = new RecyclerView.LayoutParams(-1, -2);
            } else {
                layoutParams = new RecyclerView.LayoutParams(-2, -1);
            }
            linearLayout3.setLayoutParams(layoutParams);
        }
        LinearLayout linearLayout4 = this.mHeaderLayout;
        if (linearLayout4 == null) {
            l0.S(s4);
        }
        int childCount = linearLayout4.getChildCount();
        if (index < 0 || index > childCount) {
            index = childCount;
        }
        LinearLayout linearLayout5 = this.mHeaderLayout;
        if (linearLayout5 == null) {
            l0.S(s4);
        }
        linearLayout5.addView(view, index);
        LinearLayout linearLayout6 = this.mHeaderLayout;
        if (linearLayout6 == null) {
            l0.S(s4);
        }
        if (linearLayout6.getChildCount() == 1 && (headerViewPosition = getHeaderViewPosition()) != -1) {
            notifyItemInserted(headerViewPosition);
        }
        return index;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(@l VH holder, int position) {
        l0.q(holder, ProtectedSandApp.s("็"));
        BaseUpFetchModule baseUpFetchModule = this.mUpFetchModule;
        if (baseUpFetchModule != null) {
            baseUpFetchModule.autoUpFetch$com_github_CymChad_brvah(position);
        }
        BaseLoadMoreModule baseLoadMoreModule = this.mLoadMoreModule;
        if (baseLoadMoreModule != null) {
            baseLoadMoreModule.autoLoadMore$com_github_CymChad_brvah(position);
        }
        switch (holder.getItemViewType()) {
            case HEADER_VIEW /* 268435729 */:
            case FOOTER_VIEW /* 268436275 */:
            case EMPTY_VIEW /* 268436821 */:
                break;
            case LOAD_MORE_VIEW /* 268436002 */:
                BaseLoadMoreModule baseLoadMoreModule2 = this.mLoadMoreModule;
                if (baseLoadMoreModule2 != null) {
                    baseLoadMoreModule2.getLoadMoreView().convert(holder, position, baseLoadMoreModule2.getLoadMoreStatus());
                    break;
                }
                break;
            default:
                convert(holder, getItem(position - getHeaderLayoutCount()));
                break;
        }
    }

    @j
    public final int setFooterView(@l View view, int index, int orientation) {
        l0.q(view, ProtectedSandApp.s("ไ"));
        LinearLayout linearLayout = this.mFooterLayout;
        if (linearLayout != null) {
            String s4 = ProtectedSandApp.s("ื");
            if (linearLayout == null) {
                l0.S(s4);
            }
            if (linearLayout.getChildCount() > index) {
                LinearLayout linearLayout2 = this.mFooterLayout;
                if (linearLayout2 == null) {
                    l0.S(s4);
                }
                linearLayout2.removeViewAt(index);
                LinearLayout linearLayout3 = this.mFooterLayout;
                if (linearLayout3 == null) {
                    l0.S(s4);
                }
                linearLayout3.addView(view, index);
                return index;
            }
        }
        return addFooterView(view, index, orientation);
    }

    @j
    public final int setHeaderView(@l View view, int index, int orientation) {
        l0.q(view, ProtectedSandApp.s("ไ"));
        LinearLayout linearLayout = this.mHeaderLayout;
        if (linearLayout != null) {
            String s4 = ProtectedSandApp.s("ุ");
            if (linearLayout == null) {
                l0.S(s4);
            }
            if (linearLayout.getChildCount() > index) {
                LinearLayout linearLayout2 = this.mHeaderLayout;
                if (linearLayout2 == null) {
                    l0.S(s4);
                }
                linearLayout2.removeViewAt(index);
                LinearLayout linearLayout3 = this.mHeaderLayout;
                if (linearLayout3 == null) {
                    l0.S(s4);
                }
                linearLayout3.addView(view, index);
                return index;
            }
        }
        return addHeaderView(view, index, orientation);
    }

    public void addData(@o0 T data) {
        this.data.add(data);
        notifyItemInserted(getHeaderLayoutCount() + this.data.size());
        compatibilityDataSizeChanged(1);
    }

    public void setDiffNewData(@l @o0 k.e diffResult, @l List<T> list) {
        l0.q(diffResult, ProtectedSandApp.s("๙"));
        l0.q(list, ProtectedSandApp.s("๚"));
        if (hasEmptyView()) {
            setNewInstance(list);
        } else {
            diffResult.d(new BrvahListUpdateCallback(this));
            this.data = list;
        }
    }

    public void addData(@g0(from = 0) int position, @l Collection<? extends T> newData) {
        l0.q(newData, ProtectedSandApp.s("โ"));
        this.data.addAll(position, newData);
        notifyItemRangeInserted(getHeaderLayoutCount() + position, newData.size());
        compatibilityDataSizeChanged(newData.size());
    }

    public void onBindViewHolder(@l VH holder, int position, @l List<Object> payloads) {
        l0.q(holder, ProtectedSandApp.s("็"));
        l0.q(payloads, ProtectedSandApp.s("่"));
        if (payloads.isEmpty()) {
            onBindViewHolder((BaseQuickAdapter<T, VH>) holder, position);
        }
        BaseUpFetchModule baseUpFetchModule = this.mUpFetchModule;
        if (baseUpFetchModule != null) {
            baseUpFetchModule.autoUpFetch$com_github_CymChad_brvah(position);
        }
        BaseLoadMoreModule baseLoadMoreModule = this.mLoadMoreModule;
        if (baseLoadMoreModule != null) {
            baseLoadMoreModule.autoLoadMore$com_github_CymChad_brvah(position);
        }
        switch (holder.getItemViewType()) {
            case HEADER_VIEW /* 268435729 */:
            case FOOTER_VIEW /* 268436275 */:
            case EMPTY_VIEW /* 268436821 */:
                break;
            case LOAD_MORE_VIEW /* 268436002 */:
                BaseLoadMoreModule baseLoadMoreModule2 = this.mLoadMoreModule;
                if (baseLoadMoreModule2 != null) {
                    baseLoadMoreModule2.getLoadMoreView().convert(holder, position, baseLoadMoreModule2.getLoadMoreStatus());
                    break;
                }
                break;
            default:
                convert(holder, getItem(position - getHeaderLayoutCount()), payloads);
                break;
        }
    }

    public void addData(@l @o0 Collection<? extends T> newData) {
        l0.q(newData, ProtectedSandApp.s("โ"));
        this.data.addAll(newData);
        notifyItemRangeInserted(getHeaderLayoutCount() + (this.data.size() - newData.size()), newData.size());
        compatibilityDataSizeChanged(newData.size());
    }

    public final void setEmptyView(int layoutResId) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            View inflate = LayoutInflater.from(recyclerView.getContext()).inflate(layoutResId, (ViewGroup) recyclerView, false);
            l0.h(inflate, ProtectedSandApp.s("ไ"));
            setEmptyView(inflate);
        }
    }
}
