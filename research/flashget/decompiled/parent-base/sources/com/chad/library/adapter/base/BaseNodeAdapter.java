package com.chad.library.adapter.base;

import androidx.annotation.g0;
import androidx.recyclerview.widget.k;
import com.chad.library.adapter.base.entity.node.BaseExpandNode;
import com.chad.library.adapter.base.entity.node.BaseNode;
import com.chad.library.adapter.base.entity.node.NodeFooterImp;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.provider.BaseNodeProvider;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import kd.j;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: BaseNodeAdapter.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\nJ/\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011JC\u0010\u0017\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018JC\u0010\u001a\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u0015\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b \u0010\u001fJ\u0015\u0010!\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b!\u0010\u001fJ\u001d\u0010#\u001a\u00020\u001d2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u0007H\u0014¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\u001d2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0003H\u0016¢\u0006\u0004\b(\u0010\u0006J\u001f\u0010)\u001a\u00020\u001d2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\fH\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010,\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u0002H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010,\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u0002H\u0016¢\u0006\u0004\b,\u0010.J%\u0010,\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u00072\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b,\u00100J\u001d\u0010,\u001a\u00020\u001d2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b,\u0010*J\u0017\u00101\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b1\u00102J\u001f\u00104\u001a\u00020\u001d2\u0006\u00103\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u0002H\u0016¢\u0006\u0004\b4\u0010-J\u001f\u00105\u001a\u00020\u001d2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0003H\u0016¢\u0006\u0004\b5\u0010\u0006J%\u00105\u001a\u00020\u001d2\u0006\u00107\u001a\u0002062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016¢\u0006\u0004\b5\u00108J\u001d\u0010:\u001a\u00020\u001d2\u0006\u00109\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u0002¢\u0006\u0004\b:\u0010;J%\u0010:\u001a\u00020\u001d2\u0006\u00109\u001a\u00020\u00022\u0006\u0010<\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u0002¢\u0006\u0004\b:\u0010=J+\u0010:\u001a\u00020\u001d2\u0006\u00109\u001a\u00020\u00022\u0006\u0010<\u001a\u00020\u00072\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020\f¢\u0006\u0004\b:\u0010>J\u001d\u0010?\u001a\u00020\u001d2\u0006\u00109\u001a\u00020\u00022\u0006\u0010<\u001a\u00020\u0007¢\u0006\u0004\b?\u0010@J\u001d\u0010?\u001a\u00020\u001d2\u0006\u00109\u001a\u00020\u00022\u0006\u0010A\u001a\u00020\u0002¢\u0006\u0004\b?\u0010;J%\u0010B\u001a\u00020\u001d2\u0006\u00109\u001a\u00020\u00022\u0006\u0010<\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u0002¢\u0006\u0004\bB\u0010=J#\u0010C\u001a\u00020\u001d2\u0006\u00109\u001a\u00020\u00022\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020\f¢\u0006\u0004\bC\u0010DJ9\u0010\u0017\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\u0017\u0010EJ9\u0010\u001a\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\u001a\u0010EJ9\u0010F\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\bF\u0010EJ9\u0010G\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\bG\u0010EJ9\u0010H\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\bH\u0010EJY\u0010M\u001a\u00020\u001d2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010I\u001a\u00020\u000e2\b\b\u0002\u0010J\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\bM\u0010NJ\u0015\u0010P\u001a\u00020\u00072\u0006\u0010O\u001a\u00020\u0002¢\u0006\u0004\bP\u0010QJ\u0017\u0010P\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\bP\u0010\nR$\u0010T\u001a\u0012\u0012\u0004\u0012\u00020\u00070Rj\b\u0012\u0004\u0012\u00020\u0007`S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010U¨\u0006V"}, d2 = {"Lcom/chad/library/adapter/base/BaseNodeAdapter;", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "Lcom/chad/library/adapter/base/entity/node/BaseNode;", "", "nodeList", "<init>", "(Ljava/util/List;)V", "", "position", "removeNodesAt", "(I)I", "removeChildAt", "", "list", "", "isExpanded", "flatData", "(Ljava/util/Collection;Ljava/lang/Boolean;)Ljava/util/List;", "isChangeChildCollapse", "animate", "notify", "", "parentPayload", "collapse", "(IZZZLjava/lang/Object;)I", "isChangeChildExpand", "expand", "Lcom/chad/library/adapter/base/provider/BaseNodeProvider;", "provider", "Lkotlin/k2;", "addNodeProvider", "(Lcom/chad/library/adapter/base/provider/BaseNodeProvider;)V", "addFullSpanNodeProvider", "addFooterNodeProvider", "Lcom/chad/library/adapter/base/provider/BaseItemProvider;", "addItemProvider", "(Lcom/chad/library/adapter/base/provider/BaseItemProvider;)V", "type", "isFixedViewType", "(I)Z", "setNewInstance", "setList", "(Ljava/util/Collection;)V", "data", "addData", "(ILcom/chad/library/adapter/base/entity/node/BaseNode;)V", "(Lcom/chad/library/adapter/base/entity/node/BaseNode;)V", "newData", "(ILjava/util/Collection;)V", "removeAt", "(I)V", "index", "setData", "setDiffNewData", "Landroidx/recyclerview/widget/k$e;", "diffResult", "(Landroidx/recyclerview/widget/k$e;Ljava/util/List;)V", "parentNode", "nodeAddData", "(Lcom/chad/library/adapter/base/entity/node/BaseNode;Lcom/chad/library/adapter/base/entity/node/BaseNode;)V", "childIndex", "(Lcom/chad/library/adapter/base/entity/node/BaseNode;ILcom/chad/library/adapter/base/entity/node/BaseNode;)V", "(Lcom/chad/library/adapter/base/entity/node/BaseNode;ILjava/util/Collection;)V", "nodeRemoveData", "(Lcom/chad/library/adapter/base/entity/node/BaseNode;I)V", "childNode", "nodeSetData", "nodeReplaceChildData", "(Lcom/chad/library/adapter/base/entity/node/BaseNode;Ljava/util/Collection;)V", "(IZZLjava/lang/Object;)I", "expandOrCollapse", "expandAndChild", "collapseAndChild", "isExpandedChild", "isCollapseChild", "expandPayload", "collapsePayload", "expandAndCollapseOther", "(IZZZZLjava/lang/Object;Ljava/lang/Object;)V", "node", "findParentNode", "(Lcom/chad/library/adapter/base/entity/node/BaseNode;)I", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "fullSpanNodeTypeSet", "Ljava/util/HashSet;", "com.github.CymChad.brvah"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public abstract class BaseNodeAdapter extends BaseProviderMultiAdapter<BaseNode> {
    private final HashSet<Integer> fullSpanNodeTypeSet;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseNodeAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    static /* synthetic */ int collapse$default(BaseNodeAdapter baseNodeAdapter, int i4, boolean z4, boolean z5, boolean z6, Object obj, int i5, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\u0e79"));
        }
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        boolean z7 = z4;
        boolean z10 = (i5 & 4) != 0 ? true : z5;
        boolean z11 = (i5 & 8) != 0 ? true : z6;
        if ((i5 & 16) != 0) {
            obj = null;
        }
        return baseNodeAdapter.collapse(i4, z7, z10, z11, obj);
    }

    public static /* synthetic */ int collapseAndChild$default(BaseNodeAdapter baseNodeAdapter, int i4, boolean z4, boolean z5, Object obj, int i5, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\u0e7a"));
        }
        if ((i5 & 2) != 0) {
            z4 = true;
        }
        if ((i5 & 4) != 0) {
            z5 = true;
        }
        if ((i5 & 8) != 0) {
            obj = null;
        }
        return baseNodeAdapter.collapseAndChild(i4, z4, z5, obj);
    }

    static /* synthetic */ int expand$default(BaseNodeAdapter baseNodeAdapter, int i4, boolean z4, boolean z5, boolean z6, Object obj, int i5, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\u0e7b"));
        }
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        boolean z7 = z4;
        boolean z10 = (i5 & 4) != 0 ? true : z5;
        boolean z11 = (i5 & 8) != 0 ? true : z6;
        if ((i5 & 16) != 0) {
            obj = null;
        }
        return baseNodeAdapter.expand(i4, z7, z10, z11, obj);
    }

    public static /* synthetic */ int expandAndChild$default(BaseNodeAdapter baseNodeAdapter, int i4, boolean z4, boolean z5, Object obj, int i5, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\u0e7c"));
        }
        if ((i5 & 2) != 0) {
            z4 = true;
        }
        if ((i5 & 4) != 0) {
            z5 = true;
        }
        if ((i5 & 8) != 0) {
            obj = null;
        }
        return baseNodeAdapter.expandAndChild(i4, z4, z5, obj);
    }

    public static /* synthetic */ void expandAndCollapseOther$default(BaseNodeAdapter baseNodeAdapter, int i4, boolean z4, boolean z5, boolean z6, boolean z7, Object obj, Object obj2, int i5, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\u0e7d"));
        }
        baseNodeAdapter.expandAndCollapseOther(i4, (i5 & 2) != 0 ? false : z4, (i5 & 4) != 0 ? true : z5, (i5 & 8) != 0 ? true : z6, (i5 & 16) == 0 ? z7 : true, (i5 & 32) != 0 ? null : obj, (i5 & 64) == 0 ? obj2 : null);
    }

    public static /* synthetic */ int expandOrCollapse$default(BaseNodeAdapter baseNodeAdapter, int i4, boolean z4, boolean z5, Object obj, int i5, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\u0e7e"));
        }
        if ((i5 & 2) != 0) {
            z4 = true;
        }
        if ((i5 & 4) != 0) {
            z5 = true;
        }
        if ((i5 & 8) != 0) {
            obj = null;
        }
        return baseNodeAdapter.expandOrCollapse(i4, z4, z5, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<BaseNode> flatData(Collection<? extends BaseNode> list, Boolean isExpanded) {
        BaseNode footerNode;
        List<BaseNode> childNode;
        ArrayList arrayList = new ArrayList();
        for (BaseNode baseNode : list) {
            arrayList.add(baseNode);
            if (baseNode instanceof BaseExpandNode) {
                if ((l0.g(isExpanded, Boolean.TRUE) || ((BaseExpandNode) baseNode).getIsExpanded()) && (childNode = baseNode.getChildNode()) != null && !childNode.isEmpty()) {
                    arrayList.addAll(flatData(childNode, isExpanded));
                }
                if (isExpanded != null) {
                    ((BaseExpandNode) baseNode).setExpanded(isExpanded.booleanValue());
                }
            } else {
                List<BaseNode> childNode2 = baseNode.getChildNode();
                if (childNode2 != null && !childNode2.isEmpty()) {
                    arrayList.addAll(flatData(childNode2, isExpanded));
                }
            }
            if ((baseNode instanceof NodeFooterImp) && (footerNode = ((NodeFooterImp) baseNode).getFooterNode()) != null) {
                arrayList.add(footerNode);
            }
        }
        return arrayList;
    }

    static /* synthetic */ List flatData$default(BaseNodeAdapter baseNodeAdapter, Collection collection, Boolean bool, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\u0e7f"));
        }
        if ((i4 & 2) != 0) {
            bool = null;
        }
        return baseNodeAdapter.flatData(collection, bool);
    }

    private final int removeChildAt(int position) {
        BaseNode baseNode;
        List<BaseNode> childNode;
        if (position >= getData().size() || (childNode = (baseNode = getData().get(position)).getChildNode()) == null || childNode.isEmpty()) {
            return 0;
        }
        if (!(baseNode instanceof BaseExpandNode)) {
            List<BaseNode> childNode2 = baseNode.getChildNode();
            if (childNode2 == null) {
                l0.L();
            }
            List flatData$default = flatData$default(this, childNode2, null, 2, null);
            getData().removeAll(flatData$default);
            return flatData$default.size();
        }
        if (!((BaseExpandNode) baseNode).getIsExpanded()) {
            return 0;
        }
        List<BaseNode> childNode3 = baseNode.getChildNode();
        if (childNode3 == null) {
            l0.L();
        }
        List flatData$default2 = flatData$default(this, childNode3, null, 2, null);
        getData().removeAll(flatData$default2);
        return flatData$default2.size();
    }

    private final int removeNodesAt(int position) {
        if (position >= getData().size()) {
            return 0;
        }
        int removeChildAt = removeChildAt(position);
        getData().remove(position);
        int i4 = removeChildAt + 1;
        Object obj = (BaseNode) getData().get(position);
        if (!(obj instanceof NodeFooterImp) || ((NodeFooterImp) obj).getFooterNode() == null) {
            return i4;
        }
        getData().remove(position);
        return removeChildAt + 2;
    }

    public final void addFooterNodeProvider(@l BaseNodeProvider provider) {
        l0.q(provider, ProtectedSandApp.s("ຂ"));
        addFullSpanNodeProvider(provider);
    }

    public final void addFullSpanNodeProvider(@l BaseNodeProvider provider) {
        l0.q(provider, ProtectedSandApp.s("ຂ"));
        this.fullSpanNodeTypeSet.add(Integer.valueOf(provider.getItemViewType()));
        addItemProvider(provider);
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    public void addItemProvider(@l BaseItemProvider<BaseNode> provider) {
        l0.q(provider, ProtectedSandApp.s("ຂ"));
        if (!(provider instanceof BaseNodeProvider)) {
            throw new IllegalStateException(ProtectedSandApp.s("\u0e83"));
        }
        super.addItemProvider(provider);
    }

    public final void addNodeProvider(@l BaseNodeProvider provider) {
        l0.q(provider, ProtectedSandApp.s("ຂ"));
        addItemProvider(provider);
    }

    @j
    public final int collapse(@g0(from = 0) int i4) {
        return collapse$default(this, i4, false, false, null, 14, null);
    }

    @j
    public final int collapseAndChild(@g0(from = 0) int i4) {
        return collapseAndChild$default(this, i4, false, false, null, 14, null);
    }

    @j
    public final int expand(@g0(from = 0) int i4) {
        return expand$default(this, i4, false, false, null, 14, null);
    }

    @j
    public final int expandAndChild(@g0(from = 0) int i4) {
        return expandAndChild$default(this, i4, false, false, null, 14, null);
    }

    @j
    public final void expandAndCollapseOther(@g0(from = 0) int i4) {
        expandAndCollapseOther$default(this, i4, false, false, false, false, null, null, 126, null);
    }

    @j
    public final int expandOrCollapse(@g0(from = 0) int i4) {
        return expandOrCollapse$default(this, i4, false, false, null, 14, null);
    }

    public final int findParentNode(@l BaseNode node) {
        l0.q(node, ProtectedSandApp.s("ຄ"));
        int indexOf = getData().indexOf(node);
        if (indexOf != -1 && indexOf != 0) {
            for (int i4 = indexOf - 1; i4 >= 0; i4--) {
                List<BaseNode> childNode = getData().get(i4).getChildNode();
                if (childNode != null && childNode.contains(node)) {
                    return i4;
                }
            }
        }
        return -1;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    protected boolean isFixedViewType(int type) {
        return super.isFixedViewType(type) || this.fullSpanNodeTypeSet.contains(Integer.valueOf(type));
    }

    public final void nodeAddData(@l BaseNode parentNode, @l BaseNode data) {
        l0.q(parentNode, ProtectedSandApp.s("\u0e85"));
        l0.q(data, ProtectedSandApp.s("\u0e80"));
        List<BaseNode> childNode = parentNode.getChildNode();
        if (childNode != null) {
            childNode.add(data);
            if (!(parentNode instanceof BaseExpandNode) || ((BaseExpandNode) parentNode).getIsExpanded()) {
                addData(childNode.size() + getData().indexOf(parentNode), data);
            }
        }
    }

    public final void nodeRemoveData(@l BaseNode parentNode, int childIndex) {
        l0.q(parentNode, ProtectedSandApp.s("\u0e85"));
        List<BaseNode> childNode = parentNode.getChildNode();
        if (childNode == null || childIndex >= childNode.size()) {
            return;
        }
        if ((parentNode instanceof BaseExpandNode) && !((BaseExpandNode) parentNode).getIsExpanded()) {
            childNode.remove(childIndex);
        } else {
            remove(getData().indexOf(parentNode) + 1 + childIndex);
            childNode.remove(childIndex);
        }
    }

    public final void nodeReplaceChildData(@l BaseNode parentNode, @l Collection<? extends BaseNode> newData) {
        l0.q(parentNode, ProtectedSandApp.s("\u0e85"));
        l0.q(newData, ProtectedSandApp.s("ກ"));
        List<BaseNode> childNode = parentNode.getChildNode();
        if (childNode != null) {
            if ((parentNode instanceof BaseExpandNode) && !((BaseExpandNode) parentNode).getIsExpanded()) {
                childNode.clear();
                childNode.addAll(newData);
                return;
            }
            int indexOf = getData().indexOf(parentNode);
            int removeChildAt = removeChildAt(indexOf);
            childNode.clear();
            childNode.addAll(newData);
            List flatData$default = flatData$default(this, newData, null, 2, null);
            int i4 = indexOf + 1;
            getData().addAll(i4, flatData$default);
            int headerLayoutCount = getHeaderLayoutCount() + i4;
            if (removeChildAt == flatData$default.size()) {
                notifyItemRangeChanged(headerLayoutCount, removeChildAt);
            } else {
                notifyItemRangeRemoved(headerLayoutCount, removeChildAt);
                notifyItemRangeInserted(headerLayoutCount, flatData$default.size());
            }
        }
    }

    public final void nodeSetData(@l BaseNode parentNode, int childIndex, @l BaseNode data) {
        l0.q(parentNode, ProtectedSandApp.s("\u0e85"));
        l0.q(data, ProtectedSandApp.s("\u0e80"));
        List<BaseNode> childNode = parentNode.getChildNode();
        if (childNode == null || childIndex >= childNode.size()) {
            return;
        }
        if ((parentNode instanceof BaseExpandNode) && !((BaseExpandNode) parentNode).getIsExpanded()) {
            childNode.set(childIndex, data);
        } else {
            setData(getData().indexOf(parentNode) + 1 + childIndex, data);
            childNode.set(childIndex, data);
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void removeAt(int position) {
        notifyItemRangeRemoved(getHeaderLayoutCount() + position, removeNodesAt(position));
        compatibilityDataSizeChanged(0);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void setDiffNewData(@m List<BaseNode> list) {
        if (hasEmptyView()) {
            setNewInstance(list);
        } else {
            super.setDiffNewData(flatData$default(this, list != null ? list : new ArrayList(), null, 2, null));
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void setList(@m Collection<? extends BaseNode> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        super.setList(flatData$default(this, list, null, 2, null));
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void setNewInstance(@m List<BaseNode> list) {
        super.setNewInstance(flatData$default(this, list != null ? list : new ArrayList(), null, 2, null));
    }

    public /* synthetic */ BaseNodeAdapter(List list, int i4, w wVar) {
        this((i4 & 1) != 0 ? null : list);
    }

    @j
    public final int collapse(@g0(from = 0) int i4, boolean z4) {
        return collapse$default(this, i4, z4, false, null, 12, null);
    }

    @j
    public final int collapseAndChild(@g0(from = 0) int i4, boolean z4) {
        return collapseAndChild$default(this, i4, z4, false, null, 12, null);
    }

    @j
    public final int expand(@g0(from = 0) int i4, boolean z4) {
        return expand$default(this, i4, z4, false, null, 12, null);
    }

    @j
    public final int expandAndChild(@g0(from = 0) int i4, boolean z4) {
        return expandAndChild$default(this, i4, z4, false, null, 12, null);
    }

    @j
    public final void expandAndCollapseOther(@g0(from = 0) int i4, boolean z4) {
        expandAndCollapseOther$default(this, i4, z4, false, false, false, null, null, 124, null);
    }

    @j
    public final int expandOrCollapse(@g0(from = 0) int i4, boolean z4) {
        return expandOrCollapse$default(this, i4, z4, false, null, 12, null);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void setData(int index, @l BaseNode data) {
        l0.q(data, ProtectedSandApp.s("\u0e80"));
        int removeNodesAt = removeNodesAt(index);
        List flatData$default = flatData$default(this, kotlin.collections.w.s(data), null, 2, null);
        getData().addAll(index, flatData$default);
        if (removeNodesAt == flatData$default.size()) {
            notifyItemRangeChanged(getHeaderLayoutCount() + index, removeNodesAt);
        } else {
            notifyItemRangeRemoved(getHeaderLayoutCount() + index, removeNodesAt);
            notifyItemRangeInserted(getHeaderLayoutCount() + index, flatData$default.size());
        }
    }

    public BaseNodeAdapter(@m List<BaseNode> list) {
        super(null);
        this.fullSpanNodeTypeSet = new HashSet<>();
        List<BaseNode> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        getData().addAll(flatData$default(this, list2, null, 2, null));
    }

    public static /* synthetic */ int collapse$default(BaseNodeAdapter baseNodeAdapter, int i4, boolean z4, boolean z5, Object obj, int i5, Object obj2) {
        if (obj2 == null) {
            if ((i5 & 2) != 0) {
                z4 = true;
            }
            if ((i5 & 4) != 0) {
                z5 = true;
            }
            if ((i5 & 8) != 0) {
                obj = null;
            }
            return baseNodeAdapter.collapse(i4, z4, z5, obj);
        }
        throw new UnsupportedOperationException(ProtectedSandApp.s("\u0e79"));
    }

    public static /* synthetic */ int expand$default(BaseNodeAdapter baseNodeAdapter, int i4, boolean z4, boolean z5, Object obj, int i5, Object obj2) {
        if (obj2 == null) {
            if ((i5 & 2) != 0) {
                z4 = true;
            }
            if ((i5 & 4) != 0) {
                z5 = true;
            }
            if ((i5 & 8) != 0) {
                obj = null;
            }
            return baseNodeAdapter.expand(i4, z4, z5, obj);
        }
        throw new UnsupportedOperationException(ProtectedSandApp.s("\u0e7b"));
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void addData(int position, @l BaseNode data) {
        l0.q(data, ProtectedSandApp.s("\u0e80"));
        addData(position, (Collection<? extends BaseNode>) kotlin.collections.w.s(data));
    }

    @j
    public final int collapse(@g0(from = 0) int i4, boolean z4, boolean z5) {
        return collapse$default(this, i4, z4, z5, null, 8, null);
    }

    @j
    public final int collapseAndChild(@g0(from = 0) int i4, boolean z4, boolean z5) {
        return collapseAndChild$default(this, i4, z4, z5, null, 8, null);
    }

    @j
    public final int expand(@g0(from = 0) int i4, boolean z4, boolean z5) {
        return expand$default(this, i4, z4, z5, null, 8, null);
    }

    @j
    public final int expandAndChild(@g0(from = 0) int i4, boolean z4, boolean z5) {
        return expandAndChild$default(this, i4, z4, z5, null, 8, null);
    }

    @j
    public final void expandAndCollapseOther(@g0(from = 0) int i4, boolean z4, boolean z5) {
        expandAndCollapseOther$default(this, i4, z4, z5, false, false, null, null, 120, null);
    }

    @j
    public final int expandOrCollapse(@g0(from = 0) int i4, boolean z4, boolean z5) {
        return expandOrCollapse$default(this, i4, z4, z5, null, 8, null);
    }

    private final int collapse(@g0(from = 0) int position, boolean isChangeChildCollapse, boolean animate, boolean notify, Object parentPayload) {
        BaseNode baseNode = getData().get(position);
        if (baseNode instanceof BaseExpandNode) {
            BaseExpandNode baseExpandNode = (BaseExpandNode) baseNode;
            if (baseExpandNode.getIsExpanded()) {
                int headerLayoutCount = getHeaderLayoutCount() + position;
                baseExpandNode.setExpanded(false);
                List<BaseNode> childNode = baseNode.getChildNode();
                if (childNode != null && !childNode.isEmpty()) {
                    List<BaseNode> childNode2 = baseNode.getChildNode();
                    if (childNode2 == null) {
                        l0.L();
                    }
                    List<BaseNode> flatData = flatData(childNode2, isChangeChildCollapse ? Boolean.FALSE : null);
                    int size = flatData.size();
                    getData().removeAll(flatData);
                    if (notify) {
                        if (animate) {
                            notifyItemChanged(headerLayoutCount, parentPayload);
                            notifyItemRangeRemoved(headerLayoutCount + 1, size);
                        } else {
                            notifyDataSetChanged();
                        }
                    }
                    return size;
                }
                notifyItemChanged(headerLayoutCount, parentPayload);
            }
        }
        return 0;
    }

    private final int expand(@g0(from = 0) int position, boolean isChangeChildExpand, boolean animate, boolean notify, Object parentPayload) {
        BaseNode baseNode = getData().get(position);
        if (baseNode instanceof BaseExpandNode) {
            BaseExpandNode baseExpandNode = (BaseExpandNode) baseNode;
            if (!baseExpandNode.getIsExpanded()) {
                int headerLayoutCount = getHeaderLayoutCount() + position;
                baseExpandNode.setExpanded(true);
                List<BaseNode> childNode = baseNode.getChildNode();
                if (childNode != null && !childNode.isEmpty()) {
                    List<BaseNode> childNode2 = baseNode.getChildNode();
                    if (childNode2 == null) {
                        l0.L();
                    }
                    List<BaseNode> flatData = flatData(childNode2, isChangeChildExpand ? Boolean.TRUE : null);
                    int size = flatData.size();
                    getData().addAll(position + 1, flatData);
                    if (notify) {
                        if (animate) {
                            notifyItemChanged(headerLayoutCount, parentPayload);
                            notifyItemRangeInserted(headerLayoutCount + 1, size);
                        } else {
                            notifyDataSetChanged();
                        }
                    }
                    return size;
                }
                notifyItemChanged(headerLayoutCount, parentPayload);
            }
        }
        return 0;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void addData(@l BaseNode data) {
        l0.q(data, ProtectedSandApp.s("\u0e80"));
        addData((Collection<? extends BaseNode>) kotlin.collections.w.s(data));
    }

    @j
    public final int collapseAndChild(@g0(from = 0) int position, boolean animate, boolean notify, @m Object parentPayload) {
        return collapse(position, true, animate, notify, parentPayload);
    }

    @j
    public final int expandAndChild(@g0(from = 0) int position, boolean animate, boolean notify, @m Object parentPayload) {
        return expand(position, true, animate, notify, parentPayload);
    }

    @j
    public final void expandAndCollapseOther(@g0(from = 0) int i4, boolean z4, boolean z5, boolean z6) {
        expandAndCollapseOther$default(this, i4, z4, z5, z6, false, null, null, 112, null);
    }

    @j
    public final int expandOrCollapse(@g0(from = 0) int position, boolean animate, boolean notify, @m Object parentPayload) {
        BaseNode baseNode = getData().get(position);
        if (!(baseNode instanceof BaseExpandNode)) {
            return 0;
        }
        if (((BaseExpandNode) baseNode).getIsExpanded()) {
            return collapse(position, false, animate, notify, parentPayload);
        }
        return expand(position, false, animate, notify, parentPayload);
    }

    public final int findParentNode(@g0(from = 0) int position) {
        if (position == 0) {
            return -1;
        }
        BaseNode baseNode = getData().get(position);
        for (int i4 = position - 1; i4 >= 0; i4--) {
            List<BaseNode> childNode = getData().get(i4).getChildNode();
            if (childNode != null && childNode.contains(baseNode)) {
                return i4;
            }
        }
        return -1;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void setDiffNewData(@l k.e diffResult, @l List<BaseNode> list) {
        l0.q(diffResult, ProtectedSandApp.s("ງ"));
        l0.q(list, ProtectedSandApp.s("ຈ"));
        if (hasEmptyView()) {
            setNewInstance(list);
        } else {
            super.setDiffNewData(diffResult, flatData$default(this, list, null, 2, null));
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void addData(int position, @l Collection<? extends BaseNode> newData) {
        l0.q(newData, ProtectedSandApp.s("ກ"));
        super.addData(position, (Collection) flatData$default(this, newData, null, 2, null));
    }

    @j
    public final void expandAndCollapseOther(@g0(from = 0) int i4, boolean z4, boolean z5, boolean z6, boolean z7) {
        expandAndCollapseOther$default(this, i4, z4, z5, z6, z7, null, null, 96, null);
    }

    @j
    public final void expandAndCollapseOther(@g0(from = 0) int i4, boolean z4, boolean z5, boolean z6, boolean z7, @m Object obj) {
        expandAndCollapseOther$default(this, i4, z4, z5, z6, z7, obj, null, 64, null);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void addData(@l Collection<? extends BaseNode> newData) {
        l0.q(newData, ProtectedSandApp.s("ກ"));
        super.addData((Collection) flatData$default(this, newData, null, 2, null));
    }

    @j
    public final void expandAndCollapseOther(@g0(from = 0) int position, boolean isExpandedChild, boolean isCollapseChild, boolean animate, boolean notify, @m Object expandPayload, @m Object collapsePayload) {
        int i4;
        int size;
        int expand = expand(position, isExpandedChild, animate, notify, expandPayload);
        if (expand == 0) {
            return;
        }
        int findParentNode = findParentNode(position);
        int i5 = findParentNode == -1 ? 0 : findParentNode + 1;
        if (position - i5 > 0) {
            int i6 = i5;
            i4 = position;
            do {
                int collapse = collapse(i6, isCollapseChild, animate, notify, collapsePayload);
                i6++;
                i4 -= collapse;
            } while (i6 < i4);
        } else {
            i4 = position;
        }
        if (findParentNode == -1) {
            size = getData().size() - 1;
        } else {
            List<BaseNode> childNode = getData().get(findParentNode).getChildNode();
            size = findParentNode + (childNode != null ? childNode.size() : 0) + expand;
        }
        int i7 = i4 + expand;
        if (i7 < size) {
            int i10 = i7 + 1;
            while (i10 <= size) {
                int collapse2 = collapse(i10, isCollapseChild, animate, notify, collapsePayload);
                i10++;
                size -= collapse2;
            }
        }
    }

    public final void nodeAddData(@l BaseNode parentNode, int childIndex, @l BaseNode data) {
        l0.q(parentNode, ProtectedSandApp.s("\u0e85"));
        l0.q(data, ProtectedSandApp.s("\u0e80"));
        List<BaseNode> childNode = parentNode.getChildNode();
        if (childNode != null) {
            childNode.add(childIndex, data);
            if (!(parentNode instanceof BaseExpandNode) || ((BaseExpandNode) parentNode).getIsExpanded()) {
                addData(getData().indexOf(parentNode) + 1 + childIndex, data);
            }
        }
    }

    public final void nodeRemoveData(@l BaseNode parentNode, @l BaseNode childNode) {
        l0.q(parentNode, ProtectedSandApp.s("\u0e85"));
        l0.q(childNode, ProtectedSandApp.s("ຆ"));
        List<BaseNode> childNode2 = parentNode.getChildNode();
        if (childNode2 != null) {
            if ((parentNode instanceof BaseExpandNode) && !((BaseExpandNode) parentNode).getIsExpanded()) {
                childNode2.remove(childNode);
            } else {
                remove((BaseNodeAdapter) childNode);
                childNode2.remove(childNode);
            }
        }
    }

    public final void nodeAddData(@l BaseNode parentNode, int childIndex, @l Collection<? extends BaseNode> newData) {
        l0.q(parentNode, ProtectedSandApp.s("\u0e85"));
        l0.q(newData, ProtectedSandApp.s("ກ"));
        List<BaseNode> childNode = parentNode.getChildNode();
        if (childNode != null) {
            childNode.addAll(childIndex, newData);
            if (!(parentNode instanceof BaseExpandNode) || ((BaseExpandNode) parentNode).getIsExpanded()) {
                addData(getData().indexOf(parentNode) + 1 + childIndex, newData);
            }
        }
    }

    @j
    public final int collapse(@g0(from = 0) int position, boolean animate, boolean notify, @m Object parentPayload) {
        return collapse(position, false, animate, notify, parentPayload);
    }

    @j
    public final int expand(@g0(from = 0) int position, boolean animate, boolean notify, @m Object parentPayload) {
        return expand(position, false, animate, notify, parentPayload);
    }
}
