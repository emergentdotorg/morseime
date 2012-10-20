/*
 * Copyright (c) 2010 Patrick Woodworth
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License. You may
 * obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package org.emergent.android.morseime;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.preference.DialogPreference;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author Patrick Woodworth
 */
public class CustomPreference extends DialogPreference {

  public CustomPreference(Context context, AttributeSet attrs) {
    super(context, attrs);
    LOG.debug("CustomPreference.<init> : theval = %s", getTheVal());
  }

  public CustomPreference(Context context, AttributeSet attrs, int defStyle) {
    super(context, attrs, defStyle);
    LOG.debug("CustomPreference.<init> : theval = %s", getTheVal());
  }

  private int getTheVal() {
    return getPersistedInt(99);
  }

  @Override
  public Dialog getDialog() {
    LOG.debug("CustomPreference.getDialog : theval = %s", getTheVal());
    return super.getDialog();
  }

  @Override
  public Drawable getDialogIcon() {
    LOG.debug("CustomPreference.getDialogIcon : theval = %s", getTheVal());
    return super.getDialogIcon();
  }

  @Override
  public int getDialogLayoutResource() {
    LOG.debug("CustomPreference.getDialogLayoutResource : theval = %s", getTheVal());
    return super.getDialogLayoutResource();
  }

  @Override
  public CharSequence getDialogMessage() {
    LOG.debug("CustomPreference.getDialogMessage : theval = %s", getTheVal());
    return super.getDialogMessage();
  }

  @Override
  public CharSequence getDialogTitle() {
    LOG.debug("CustomPreference.getDialogTitle : theval = %s", getTheVal());
    return super.getDialogTitle();
  }

  @Override
  public CharSequence getNegativeButtonText() {
    LOG.debug("CustomPreference.getNegativeButtonText : theval = %s", getTheVal());
    return super.getNegativeButtonText();
  }

  @Override
  public CharSequence getPositiveButtonText() {
    LOG.debug("CustomPreference.getPositiveButtonText : theval = %s", getTheVal());
    return super.getPositiveButtonText();
  }

  @Override
  public void onActivityDestroy() {
    LOG.debug("CustomPreference.onActivityDestroy : theval = %s", getTheVal());
    super.onActivityDestroy();
  }

  @Override
  protected void onBindDialogView(View view) {
    LOG.debug("CustomPreference.onBindDialogView : theval = %s", getTheVal());
    super.onBindDialogView(view);
  }

  @Override
  protected void onClick() {
    LOG.debug("CustomPreference.onClick : theval = %s", getTheVal());
    super.onClick();
  }

  @Override
  public void onClick(DialogInterface dialog, int which) {
    LOG.debug("CustomPreference.onClick : theval = %s", getTheVal());
    super.onClick(dialog, which);
  }

  @Override
  protected View onCreateDialogView() {
    LOG.debug("CustomPreference.onCreateDialogView : theval = %s", getTheVal());
    return super.onCreateDialogView();
  }

  @Override
  protected void onDialogClosed(boolean positiveResult) {
    LOG.debug("CustomPreference.onDialogClosed : theval = %s", getTheVal());
    super.onDialogClosed(positiveResult);
  }

  @Override
  public void onDismiss(DialogInterface dialog) {
    LOG.debug("CustomPreference.onDismiss : theval = %s", getTheVal());
    super.onDismiss(dialog);
  }

  @Override
  protected void onPrepareDialogBuilder(AlertDialog.Builder builder) {
    LOG.debug("CustomPreference.onPrepareDialogBuilder : theval = %s", getTheVal());
    super.onPrepareDialogBuilder(builder);
  }

  @Override
  protected void onRestoreInstanceState(Parcelable state) {
    LOG.debug("CustomPreference.onRestoreInstanceState : theval = %s", getTheVal());
    super.onRestoreInstanceState(state);
  }

  @Override
  protected Parcelable onSaveInstanceState() {
    LOG.debug("CustomPreference.onSaveInstanceState : theval = %s", getTheVal());
    return super.onSaveInstanceState();
  }

  @Override
  public void setDialogIcon(Drawable dialogIcon) {
    LOG.debug("CustomPreference.setDialogIcon : theval = %s", getTheVal());
    super.setDialogIcon(dialogIcon);
  }

  @Override
  public void setDialogIcon(int dialogIconRes) {
    LOG.debug("CustomPreference.setDialogIcon : theval = %s", getTheVal());
    super.setDialogIcon(dialogIconRes);
  }

  @Override
  public void setDialogLayoutResource(int dialogLayoutResId) {
    LOG.debug("CustomPreference.setDialogLayoutResource : theval = %s", getTheVal());
    super.setDialogLayoutResource(dialogLayoutResId);
  }

  @Override
  public void setDialogMessage(CharSequence dialogMessage) {
    LOG.debug("CustomPreference.setDialogMessage : theval = %s", getTheVal());
    super.setDialogMessage(dialogMessage);
  }

  @Override
  public void setDialogMessage(int dialogMessageResId) {
    LOG.debug("CustomPreference.setDialogMessage : theval = %s", getTheVal());
    super.setDialogMessage(dialogMessageResId);
  }

  @Override
  public void setDialogTitle(CharSequence dialogTitle) {
    LOG.debug("CustomPreference.setDialogTitle : theval = %s", getTheVal());
    super.setDialogTitle(dialogTitle);
  }

  @Override
  public void setDialogTitle(int dialogTitleResId) {
    LOG.debug("CustomPreference.setDialogTitle : theval = %s", getTheVal());
    super.setDialogTitle(dialogTitleResId);
  }

  @Override
  public void setNegativeButtonText(CharSequence negativeButtonText) {
    LOG.debug("CustomPreference.setNegativeButtonText : theval = %s", getTheVal());
    super.setNegativeButtonText(negativeButtonText);
  }

  @Override
  public void setNegativeButtonText(int negativeButtonTextResId) {
    LOG.debug("CustomPreference.setNegativeButtonText : theval = %s", getTheVal());
    super.setNegativeButtonText(negativeButtonTextResId);
  }

  @Override
  public void setPositiveButtonText(CharSequence positiveButtonText) {
    LOG.debug("CustomPreference.setPositiveButtonText : theval = %s", getTheVal());
    super.setPositiveButtonText(positiveButtonText);
  }

  @Override
  public void setPositiveButtonText(int positiveButtonTextResId) {
    LOG.debug("CustomPreference.setPositiveButtonText : theval = %s", getTheVal());
    super.setPositiveButtonText(positiveButtonTextResId);
  }

  @Override
  protected void showDialog(Bundle state) {
    LOG.debug("CustomPreference.showDialog : theval = %s", getTheVal());
    super.showDialog(state);
  }

  @Override
  protected boolean callChangeListener(Object newValue) {
    LOG.debug("CustomPreference.callChangeListener : theval = %s", getTheVal());
    return super.callChangeListener(newValue);
  }

  @Override
  public int compareTo(Preference another) {
    LOG.debug("CustomPreference.compareTo : theval = %s", getTheVal());
    return super.compareTo(another);
  }

  @Override
  protected Preference findPreferenceInHierarchy(String key) {
    LOG.debug("CustomPreference.findPreferenceInHierarchy : theval = %s", getTheVal());
    return super.findPreferenceInHierarchy(key);
  }

  @Override
  public Context getContext() {
    LOG.debug("CustomPreference.getContext : theval = %s", getTheVal());
    return super.getContext();
  }

  @Override
  public String getDependency() {
    LOG.debug("CustomPreference.getDependency : theval = %s", getTheVal());
    return super.getDependency();
  }

  @Override
  public SharedPreferences.Editor getEditor() {
    LOG.debug("CustomPreference.getEditor : theval = %s", getTheVal());
    return super.getEditor();
  }

  @Override
  public Intent getIntent() {
    LOG.debug("CustomPreference.getIntent : theval = %s", getTheVal());
    return super.getIntent();
  }

  @Override
  public String getKey() {
    LOG.debug("CustomPreference.getKey : theval = %s", getTheVal());
    return super.getKey();
  }

  @Override
  public int getLayoutResource() {
    LOG.debug("CustomPreference.getLayoutResource : theval = %s", getTheVal());
    return super.getLayoutResource();
  }

  @Override
  public OnPreferenceChangeListener getOnPreferenceChangeListener() {
    LOG.debug("CustomPreference.getOnPreferenceChangeListener : theval = %s", getTheVal());
    return super.getOnPreferenceChangeListener();
  }

  @Override
  public OnPreferenceClickListener getOnPreferenceClickListener() {
    LOG.debug("CustomPreference.getOnPreferenceClickListener : theval = %s", getTheVal());
    return super.getOnPreferenceClickListener();
  }

  @Override
  public int getOrder() {
    LOG.debug("CustomPreference.getOrder : theval = %s", getTheVal());
    return super.getOrder();
  }

  @Override
  protected boolean getPersistedBoolean(boolean defaultReturnValue) {
//    LOG.debug("CustomPreference.getPersistedBoolean : theval = %s", getTheVal());
    return super.getPersistedBoolean(defaultReturnValue);
  }

  @Override
  protected float getPersistedFloat(float defaultReturnValue) {
//    LOG.debug("CustomPreference.getPersistedFloat : theval = %s", getTheVal());
    return super.getPersistedFloat(defaultReturnValue);
  }

  @Override
  protected int getPersistedInt(int defaultReturnValue) {
//    LOG.debug("CustomPreference.getPersistedInt : theval = %s", getTheVal());
    return super.getPersistedInt(defaultReturnValue);
  }

  @Override
  protected long getPersistedLong(long defaultReturnValue) {
//    LOG.debug("CustomPreference.getPersistedLong : theval = %s", getTheVal());
    return super.getPersistedLong(defaultReturnValue);
  }

  @Override
  protected String getPersistedString(String defaultReturnValue) {
//    LOG.debug("CustomPreference.getPersistedString : theval = %s", getTheVal());
    return super.getPersistedString(defaultReturnValue);
  }

  @Override
  public PreferenceManager getPreferenceManager() {
//    LOG.debug("CustomPreference.getPreferenceManager : theval = %s", getTheVal());
    return super.getPreferenceManager();
  }

  @Override
  public SharedPreferences getSharedPreferences() {
//    LOG.debug("CustomPreference.getSharedPreferences : theval = %s", getTheVal());
    return super.getSharedPreferences();
  }

  @Override
  public boolean getShouldDisableView() {
    LOG.debug("CustomPreference.getShouldDisableView : theval = %s", getTheVal());
    return super.getShouldDisableView();
  }

  @Override
  public CharSequence getSummary() {
    LOG.debug("CustomPreference.getSummary : theval = %s", getTheVal());
    return super.getSummary();
  }

  @Override
  public CharSequence getTitle() {
    LOG.debug("CustomPreference.getTitle : theval = %s", getTheVal());
    return super.getTitle();
  }

  @Override
  public View getView(View convertView, ViewGroup parent) {
    LOG.debug("CustomPreference.getView : theval = %s", getTheVal());
    return super.getView(convertView, parent);
  }

  @Override
  public int getWidgetLayoutResource() {
    LOG.debug("CustomPreference.getWidgetLayoutResource : theval = %s", getTheVal());
    return super.getWidgetLayoutResource();
  }

  @Override
  public boolean hasKey() {
//    LOG.debug("CustomPreference.hasKey : theval = %s", getTheVal());
    return super.hasKey();
  }

  @Override
  public boolean isEnabled() {
    LOG.debug("CustomPreference.isEnabled : theval = %s", getTheVal());
    return super.isEnabled();
  }

  @Override
  public boolean isPersistent() {
//    LOG.debug("CustomPreference.isPersistent : theval = %s", getTheVal());
    return super.isPersistent();
  }

  @Override
  public boolean isSelectable() {
    LOG.debug("CustomPreference.isSelectable : theval = %s", getTheVal());
    return super.isSelectable();
  }

  @Override
  protected void notifyChanged() {
    LOG.debug("CustomPreference.notifyChanged : theval = %s", getTheVal());
    super.notifyChanged();
  }

  @Override
  public void notifyDependencyChange(boolean disableDependents) {
    LOG.debug("CustomPreference.notifyDependencyChange : theval = %s", getTheVal());
    super.notifyDependencyChange(disableDependents);
  }

  @Override
  protected void notifyHierarchyChanged() {
    LOG.debug("CustomPreference.notifyHierarchyChanged : theval = %s", getTheVal());
    super.notifyHierarchyChanged();
  }

  @Override
  protected void onAttachedToActivity() {
    LOG.debug("CustomPreference.onAttachedToActivity : theval = %s", getTheVal());
    super.onAttachedToActivity();
  }

  @Override
  protected void onAttachedToHierarchy(PreferenceManager preferenceManager) {
    LOG.debug("CustomPreference.onAttachedToHierarchy : theval = %s", getTheVal());
    super.onAttachedToHierarchy(preferenceManager);
  }

  @Override
  protected void onBindView(View view) {
    LOG.debug("CustomPreference.onBindView : theval = %s", getTheVal());
    super.onBindView(view);
  }

  @Override
  protected View onCreateView(ViewGroup parent) {
    LOG.debug("CustomPreference.onCreateView : theval = %s", getTheVal());
    return super.onCreateView(parent);
  }

  @Override
  public void onDependencyChanged(Preference dependency, boolean disableDependent) {
    LOG.debug("CustomPreference.onDependencyChanged : theval = %s", getTheVal());
    super.onDependencyChanged(dependency, disableDependent);
  }

  @Override
  protected Object onGetDefaultValue(TypedArray a, int index) {
    LOG.debug("CustomPreference.onGetDefaultValue : theval = %s", getTheVal());
    return super.onGetDefaultValue(a, index);
  }

  @Override
  protected void onPrepareForRemoval() {
    LOG.debug("CustomPreference.onPrepareForRemoval : theval = %s", getTheVal());
    super.onPrepareForRemoval();
  }

  @Override
  protected void onSetInitialValue(boolean restorePersistedValue, Object defaultValue) {
    LOG.debug("CustomPreference.onSetInitialValue : theval = %s", getTheVal());
    super.onSetInitialValue(restorePersistedValue, defaultValue);
  }

  @Override
  protected boolean persistBoolean(boolean value) {
    LOG.debug("CustomPreference.persistBoolean : theval = %s", getTheVal());
    return super.persistBoolean(value);
  }

  @Override
  protected boolean persistFloat(float value) {
    LOG.debug("CustomPreference.persistFloat : theval = %s", getTheVal());
    return super.persistFloat(value);
  }

  @Override
  protected boolean persistInt(int value) {
    LOG.debug("CustomPreference.persistInt : theval = %s", getTheVal());
    return super.persistInt(value);
  }

  @Override
  protected boolean persistLong(long value) {
    LOG.debug("CustomPreference.persistLong : theval = %s", getTheVal());
    return super.persistLong(value);
  }

  @Override
  protected boolean persistString(String value) {
    LOG.debug("CustomPreference.persistString : theval = %s", getTheVal());
    return super.persistString(value);
  }

  @Override
  public void restoreHierarchyState(Bundle container) {
    LOG.debug("CustomPreference.restoreHierarchyState : theval = %s", getTheVal());
    super.restoreHierarchyState(container);
  }

  @Override
  public void saveHierarchyState(Bundle container) {
    LOG.debug("CustomPreference.saveHierarchyState : theval = %s", getTheVal());
    super.saveHierarchyState(container);
  }

  @Override
  public void setDefaultValue(Object defaultValue) {
    LOG.debug("CustomPreference.setDefaultValue : theval = %s", getTheVal());
    super.setDefaultValue(defaultValue);
  }

  @Override
  public void setDependency(String dependencyKey) {
    LOG.debug("CustomPreference.setDependency : theval = %s", getTheVal());
    super.setDependency(dependencyKey);
  }

  @Override
  public void setEnabled(boolean enabled) {
    LOG.debug("CustomPreference.setEnabled : theval = %s", getTheVal());
    super.setEnabled(enabled);
  }

  @Override
  public void setIntent(Intent intent) {
    LOG.debug("CustomPreference.setIntent : theval = %s", getTheVal());
    super.setIntent(intent);
  }

  @Override
  public void setKey(String key) {
    LOG.debug("CustomPreference.setKey : theval = %s", getTheVal());
    super.setKey(key);
  }

  @Override
  public void setLayoutResource(int layoutResId) {
    LOG.debug("CustomPreference.setLayoutResource : theval = %s", getTheVal());
    super.setLayoutResource(layoutResId);
  }

  @Override
  public void setOnPreferenceChangeListener(OnPreferenceChangeListener onPreferenceChangeListener) {
    LOG.debug("CustomPreference.setOnPreferenceChangeListener : theval = %s", getTheVal());
    super.setOnPreferenceChangeListener(onPreferenceChangeListener);
  }

  @Override
  public void setOnPreferenceClickListener(OnPreferenceClickListener onPreferenceClickListener) {
    LOG.debug("CustomPreference.setOnPreferenceClickListener : theval = %s", getTheVal());
    super.setOnPreferenceClickListener(onPreferenceClickListener);
  }

  @Override
  public void setOrder(int order) {
    LOG.debug("CustomPreference.setOrder : theval = %s", getTheVal());
    super.setOrder(order);
  }

  @Override
  public void setPersistent(boolean persistent) {
    LOG.debug("CustomPreference.setPersistent : theval = %s", getTheVal());
    super.setPersistent(persistent);
  }

  @Override
  public void setSelectable(boolean selectable) {
    LOG.debug("CustomPreference.setSelectable : theval = %s", getTheVal());
    super.setSelectable(selectable);
  }

  @Override
  public void setShouldDisableView(boolean shouldDisableView) {
    LOG.debug("CustomPreference.setShouldDisableView : theval = %s", getTheVal());
    super.setShouldDisableView(shouldDisableView);
  }

  @Override
  public void setSummary(CharSequence summary) {
    LOG.debug("CustomPreference.setSummary : theval = %s", getTheVal());
    super.setSummary(summary);
  }

  @Override
  public void setSummary(int summaryResId) {
    LOG.debug("CustomPreference.setSummary : theval = %s", getTheVal());
    super.setSummary(summaryResId);
  }

  @Override
  public void setTitle(CharSequence title) {
    LOG.debug("CustomPreference.setTitle : theval = %s", getTheVal());
    super.setTitle(title);
  }

  @Override
  public void setTitle(int titleResId) {
    LOG.debug("CustomPreference.setTitle : theval = %s", getTheVal());
    super.setTitle(titleResId);
  }

  @Override
  public void setWidgetLayoutResource(int widgetLayoutResId) {
    LOG.debug("CustomPreference.setWidgetLayoutResource : theval = %s", getTheVal());
    super.setWidgetLayoutResource(widgetLayoutResId);
  }

  @Override
  public boolean shouldCommit() {
    LOG.debug("CustomPreference.shouldCommit : theval = %s", getTheVal());
    return super.shouldCommit();
  }

  @Override
  public boolean shouldDisableDependents() {
    LOG.debug("CustomPreference.shouldDisableDependents : theval = %s", getTheVal());
    return super.shouldDisableDependents();
  }

  @Override
  protected boolean shouldPersist() {
//    LOG.debug("CustomPreference.shouldPersist : theval = %s", getTheVal());
    return super.shouldPersist();
  }
}
