package com.baymax.demoapp.databinding;
import com.baymax.demoapp.R;
import com.baymax.demoapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(13);
        sIncludes.setIncludes(1, 
            new String[] {"custom_progress_bar"},
            new int[] {10},
            new int[] {com.baymax.demoapp.R.layout.custom_progress_bar});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_current_value_text, 11);
        sViewsWithIds.put(R.id.tv_total_investment_text, 12);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.baymax.demoapp.databinding.CustomProgressBarBinding) bindings[10]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[11]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[9]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[6]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[12]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            );
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView3 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[3];
        this.mboundView3.setTag(null);
        setContainedBinding(this.progressBar);
        this.recyclerView.setTag(null);
        this.root.setTag(null);
        this.tvCurrentValue.setTag(null);
        this.tvPnl.setTag(null);
        this.tvPnlValue.setTag(null);
        this.tvTodaysPnlText.setTag(null);
        this.tvTodaysPnlValue.setTag(null);
        this.tvTotalInvestmentValue.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        progressBar.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (progressBar.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.holdingsPageStateData == variableId) {
            setHoldingsPageStateData((com.baymax.demoapp.ui.activity.main_activity.ui.HoldingsPageStateData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHoldingsPageStateData(@Nullable com.baymax.demoapp.ui.activity.main_activity.ui.HoldingsPageStateData HoldingsPageStateData) {
        this.mHoldingsPageStateData = HoldingsPageStateData;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.holdingsPageStateData);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        progressBar.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeProgressBar((com.baymax.demoapp.databinding.CustomProgressBarBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeProgressBar(com.baymax.demoapp.databinding.CustomProgressBarBinding ProgressBar, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        int holdingsPageStateDataProgressBarVisibilityViewVISIBLEViewGONE = 0;
        int holdingsPageStateDataListVisibilityViewVISIBLEViewGONE = 0;
        boolean holdingsPageStateDataListVisibility = false;
        java.lang.String javaLangStringHoldingsPageStateDataHoldingsDataTotalInvestment = null;
        int holdingsPageStateDataHoldingsDataTotalInvestmentJavaLangObjectNullViewGONEViewVISIBLE = 0;
        boolean holdingsPageStateDataHoldingsDataCurrentValueJavaLangObjectNull = false;
        int holdingsPageStateDataHoldingsDataCurrentValueJavaLangObjectNullViewGONEViewVISIBLE = 0;
        java.lang.String holdingsPageStateDataHoldingsDataPnl = null;
        java.lang.String holdingsPageStateDataHoldingsDataTotalInvestment = null;
        com.baymax.demoapp.ui.activity.main_activity.ui.HoldingsPageStateData holdingsPageStateData = mHoldingsPageStateData;
        com.baymax.demoapp.api.domain_model.HoldingsDataDM holdingsPageStateDataHoldingsData = null;
        java.lang.String holdingsPageStateDataHoldingsDataTodaysPnL = null;
        java.lang.String javaLangStringHoldingsPageStateDataHoldingsDataPnl = null;
        int holdingsPageStateDataHoldingsDataTodaysPnLJavaLangObjectNullViewGONEViewVISIBLE = 0;
        java.lang.String javaLangStringHoldingsPageStateDataHoldingsDataTodaysPnL = null;
        java.lang.String javaLangStringHoldingsPageStateDataHoldingsDataCurrentValue = null;
        boolean holdingsPageStateDataHoldingsDataPnlJavaLangObjectNull = false;
        boolean holdingsPageStateDataProgressBarVisibility = false;
        int holdingsPageStateDataHoldingsDataPnlJavaLangObjectNullViewGONEViewVISIBLE = 0;
        java.lang.String holdingsPageStateDataHoldingsDataCurrentValue = null;
        boolean holdingsPageStateDataHoldingsDataTodaysPnLJavaLangObjectNull = false;
        int holdingsPageStateDataSummaryCardVisibilityViewVISIBLEViewGONE = 0;
        boolean holdingsPageStateDataHoldingsDataTotalInvestmentJavaLangObjectNull = false;
        boolean holdingsPageStateDataSummaryCardVisibility = false;

        if ((dirtyFlags & 0x6L) != 0) {



                if (holdingsPageStateData != null) {
                    // read holdingsPageStateData.listVisibility
                    holdingsPageStateDataListVisibility = holdingsPageStateData.getListVisibility();
                    // read holdingsPageStateData.holdingsData
                    holdingsPageStateDataHoldingsData = holdingsPageStateData.getHoldingsData();
                    // read holdingsPageStateData.progressBarVisibility
                    holdingsPageStateDataProgressBarVisibility = holdingsPageStateData.getProgressBarVisibility();
                    // read holdingsPageStateData.summaryCardVisibility
                    holdingsPageStateDataSummaryCardVisibility = holdingsPageStateData.getSummaryCardVisibility();
                }
            if((dirtyFlags & 0x6L) != 0) {
                if(holdingsPageStateDataListVisibility) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
            if((dirtyFlags & 0x6L) != 0) {
                if(holdingsPageStateDataProgressBarVisibility) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
            if((dirtyFlags & 0x6L) != 0) {
                if(holdingsPageStateDataSummaryCardVisibility) {
                        dirtyFlags |= 0x10000L;
                }
                else {
                        dirtyFlags |= 0x8000L;
                }
            }


                // read holdingsPageStateData.listVisibility ? View.VISIBLE : View.GONE
                holdingsPageStateDataListVisibilityViewVISIBLEViewGONE = ((holdingsPageStateDataListVisibility) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read holdingsPageStateData.progressBarVisibility ? View.VISIBLE : View.GONE
                holdingsPageStateDataProgressBarVisibilityViewVISIBLEViewGONE = ((holdingsPageStateDataProgressBarVisibility) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read holdingsPageStateData.summaryCardVisibility ? View.VISIBLE : View.GONE
                holdingsPageStateDataSummaryCardVisibilityViewVISIBLEViewGONE = ((holdingsPageStateDataSummaryCardVisibility) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                if (holdingsPageStateDataHoldingsData != null) {
                    // read holdingsPageStateData.holdingsData.pnl
                    holdingsPageStateDataHoldingsDataPnl = holdingsPageStateDataHoldingsData.getPnl();
                    // read holdingsPageStateData.holdingsData.totalInvestment
                    holdingsPageStateDataHoldingsDataTotalInvestment = holdingsPageStateDataHoldingsData.getTotalInvestment();
                    // read holdingsPageStateData.holdingsData.todaysPnL
                    holdingsPageStateDataHoldingsDataTodaysPnL = holdingsPageStateDataHoldingsData.getTodaysPnL();
                    // read holdingsPageStateData.holdingsData.currentValue
                    holdingsPageStateDataHoldingsDataCurrentValue = holdingsPageStateDataHoldingsData.getCurrentValue();
                }


                // read ("₹") + (holdingsPageStateData.holdingsData.pnl)
                javaLangStringHoldingsPageStateDataHoldingsDataPnl = ("₹") + (holdingsPageStateDataHoldingsDataPnl);
                // read holdingsPageStateData.holdingsData.pnl == null
                holdingsPageStateDataHoldingsDataPnlJavaLangObjectNull = (holdingsPageStateDataHoldingsDataPnl) == (null);
                // read ("₹") + (holdingsPageStateData.holdingsData.totalInvestment)
                javaLangStringHoldingsPageStateDataHoldingsDataTotalInvestment = ("₹") + (holdingsPageStateDataHoldingsDataTotalInvestment);
                // read holdingsPageStateData.holdingsData.totalInvestment == null
                holdingsPageStateDataHoldingsDataTotalInvestmentJavaLangObjectNull = (holdingsPageStateDataHoldingsDataTotalInvestment) == (null);
                // read ("₹") + (holdingsPageStateData.holdingsData.todaysPnL)
                javaLangStringHoldingsPageStateDataHoldingsDataTodaysPnL = ("₹") + (holdingsPageStateDataHoldingsDataTodaysPnL);
                // read holdingsPageStateData.holdingsData.todaysPnL == null
                holdingsPageStateDataHoldingsDataTodaysPnLJavaLangObjectNull = (holdingsPageStateDataHoldingsDataTodaysPnL) == (null);
                // read holdingsPageStateData.holdingsData.currentValue == null
                holdingsPageStateDataHoldingsDataCurrentValueJavaLangObjectNull = (holdingsPageStateDataHoldingsDataCurrentValue) == (null);
                // read ("₹") + (holdingsPageStateData.holdingsData.currentValue)
                javaLangStringHoldingsPageStateDataHoldingsDataCurrentValue = ("₹") + (holdingsPageStateDataHoldingsDataCurrentValue);
            if((dirtyFlags & 0x6L) != 0) {
                if(holdingsPageStateDataHoldingsDataPnlJavaLangObjectNull) {
                        dirtyFlags |= 0x4000L;
                }
                else {
                        dirtyFlags |= 0x2000L;
                }
            }
            if((dirtyFlags & 0x6L) != 0) {
                if(holdingsPageStateDataHoldingsDataTotalInvestmentJavaLangObjectNull) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }
            if((dirtyFlags & 0x6L) != 0) {
                if(holdingsPageStateDataHoldingsDataTodaysPnLJavaLangObjectNull) {
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x800L;
                }
            }
            if((dirtyFlags & 0x6L) != 0) {
                if(holdingsPageStateDataHoldingsDataCurrentValueJavaLangObjectNull) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }


                // read holdingsPageStateData.holdingsData.pnl == null ? View.GONE : View.VISIBLE
                holdingsPageStateDataHoldingsDataPnlJavaLangObjectNullViewGONEViewVISIBLE = ((holdingsPageStateDataHoldingsDataPnlJavaLangObjectNull) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read holdingsPageStateData.holdingsData.totalInvestment == null ? View.GONE : View.VISIBLE
                holdingsPageStateDataHoldingsDataTotalInvestmentJavaLangObjectNullViewGONEViewVISIBLE = ((holdingsPageStateDataHoldingsDataTotalInvestmentJavaLangObjectNull) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read holdingsPageStateData.holdingsData.todaysPnL == null ? View.GONE : View.VISIBLE
                holdingsPageStateDataHoldingsDataTodaysPnLJavaLangObjectNullViewGONEViewVISIBLE = ((holdingsPageStateDataHoldingsDataTodaysPnLJavaLangObjectNull) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read holdingsPageStateData.holdingsData.currentValue == null ? View.GONE : View.VISIBLE
                holdingsPageStateDataHoldingsDataCurrentValueJavaLangObjectNullViewGONEViewVISIBLE = ((holdingsPageStateDataHoldingsDataCurrentValueJavaLangObjectNull) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.mboundView3.setVisibility(holdingsPageStateDataSummaryCardVisibilityViewVISIBLEViewGONE);
            this.progressBar.getRoot().setVisibility(holdingsPageStateDataProgressBarVisibilityViewVISIBLEViewGONE);
            this.recyclerView.setVisibility(holdingsPageStateDataListVisibilityViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCurrentValue, javaLangStringHoldingsPageStateDataHoldingsDataCurrentValue);
            this.tvCurrentValue.setVisibility(holdingsPageStateDataHoldingsDataCurrentValueJavaLangObjectNullViewGONEViewVISIBLE);
            this.tvPnl.setVisibility(holdingsPageStateDataHoldingsDataPnlJavaLangObjectNullViewGONEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPnlValue, javaLangStringHoldingsPageStateDataHoldingsDataPnl);
            this.tvPnlValue.setVisibility(holdingsPageStateDataHoldingsDataPnlJavaLangObjectNullViewGONEViewVISIBLE);
            this.tvTodaysPnlText.setVisibility(holdingsPageStateDataHoldingsDataTodaysPnLJavaLangObjectNullViewGONEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTodaysPnlValue, javaLangStringHoldingsPageStateDataHoldingsDataTodaysPnL);
            this.tvTodaysPnlValue.setVisibility(holdingsPageStateDataHoldingsDataTodaysPnLJavaLangObjectNullViewGONEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTotalInvestmentValue, javaLangStringHoldingsPageStateDataHoldingsDataTotalInvestment);
            this.tvTotalInvestmentValue.setVisibility(holdingsPageStateDataHoldingsDataTotalInvestmentJavaLangObjectNullViewGONEViewVISIBLE);
        }
        executeBindingsOn(progressBar);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): progressBar
        flag 1 (0x2L): holdingsPageStateData
        flag 2 (0x3L): null
        flag 3 (0x4L): holdingsPageStateData.progressBarVisibility ? View.VISIBLE : View.GONE
        flag 4 (0x5L): holdingsPageStateData.progressBarVisibility ? View.VISIBLE : View.GONE
        flag 5 (0x6L): holdingsPageStateData.listVisibility ? View.VISIBLE : View.GONE
        flag 6 (0x7L): holdingsPageStateData.listVisibility ? View.VISIBLE : View.GONE
        flag 7 (0x8L): holdingsPageStateData.holdingsData.totalInvestment == null ? View.GONE : View.VISIBLE
        flag 8 (0x9L): holdingsPageStateData.holdingsData.totalInvestment == null ? View.GONE : View.VISIBLE
        flag 9 (0xaL): holdingsPageStateData.holdingsData.currentValue == null ? View.GONE : View.VISIBLE
        flag 10 (0xbL): holdingsPageStateData.holdingsData.currentValue == null ? View.GONE : View.VISIBLE
        flag 11 (0xcL): holdingsPageStateData.holdingsData.todaysPnL == null ? View.GONE : View.VISIBLE
        flag 12 (0xdL): holdingsPageStateData.holdingsData.todaysPnL == null ? View.GONE : View.VISIBLE
        flag 13 (0xeL): holdingsPageStateData.holdingsData.pnl == null ? View.GONE : View.VISIBLE
        flag 14 (0xfL): holdingsPageStateData.holdingsData.pnl == null ? View.GONE : View.VISIBLE
        flag 15 (0x10L): holdingsPageStateData.summaryCardVisibility ? View.VISIBLE : View.GONE
        flag 16 (0x11L): holdingsPageStateData.summaryCardVisibility ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}