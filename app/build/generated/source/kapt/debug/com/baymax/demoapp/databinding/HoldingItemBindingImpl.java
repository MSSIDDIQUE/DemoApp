package com.baymax.demoapp.databinding;
import com.baymax.demoapp.R;
import com.baymax.demoapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class HoldingItemBindingImpl extends HoldingItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public HoldingItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private HoldingItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvLtp.setTag(null);
        this.tvPl.setTag(null);
        this.tvQuantity.setTag(null);
        this.tvSymbol.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.holdingData == variableId) {
            setHoldingData((com.baymax.demoapp.api.domain_model.HoldingDM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHoldingData(@Nullable com.baymax.demoapp.api.domain_model.HoldingDM HoldingData) {
        this.mHoldingData = HoldingData;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.holdingData);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String holdingDataSymbol = null;
        com.baymax.demoapp.api.domain_model.HoldingDM holdingData = mHoldingData;
        java.lang.String holdingDataLtp = null;
        java.lang.String holdingDataQuantity = null;
        java.lang.String javaLangStringLTPHoldingDataLtp = null;
        java.lang.String holdingDataPln = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (holdingData != null) {
                    // read holdingData.symbol
                    holdingDataSymbol = holdingData.getSymbol();
                    // read holdingData.ltp
                    holdingDataLtp = holdingData.getLtp();
                    // read holdingData.quantity
                    holdingDataQuantity = holdingData.getQuantity();
                    // read holdingData.pln
                    holdingDataPln = holdingData.getPln();
                }


                // read ("LTP : ???") + (holdingData.ltp)
                javaLangStringLTPHoldingDataLtp = ("LTP : ???") + (holdingDataLtp);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvLtp, javaLangStringLTPHoldingDataLtp);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPl, holdingDataPln);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvQuantity, holdingDataQuantity);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSymbol, holdingDataSymbol);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): holdingData
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}