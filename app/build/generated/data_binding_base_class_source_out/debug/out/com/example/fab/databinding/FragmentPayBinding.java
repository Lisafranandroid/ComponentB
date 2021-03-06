// Generated by view binder compiler. Do not edit!
package com.example.fab.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.fab.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentPayBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final EditText Address;

  @NonNull
  public final EditText Emailaddress;

  @NonNull
  public final EditText Name;

  @NonNull
  public final EditText Phonenumber;

  @NonNull
  public final Button Submit;

  private FragmentPayBinding(@NonNull FrameLayout rootView, @NonNull EditText Address,
      @NonNull EditText Emailaddress, @NonNull EditText Name, @NonNull EditText Phonenumber,
      @NonNull Button Submit) {
    this.rootView = rootView;
    this.Address = Address;
    this.Emailaddress = Emailaddress;
    this.Name = Name;
    this.Phonenumber = Phonenumber;
    this.Submit = Submit;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentPayBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentPayBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_pay, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentPayBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Address;
      EditText Address = ViewBindings.findChildViewById(rootView, id);
      if (Address == null) {
        break missingId;
      }

      id = R.id.Emailaddress;
      EditText Emailaddress = ViewBindings.findChildViewById(rootView, id);
      if (Emailaddress == null) {
        break missingId;
      }

      id = R.id.Name;
      EditText Name = ViewBindings.findChildViewById(rootView, id);
      if (Name == null) {
        break missingId;
      }

      id = R.id.Phonenumber;
      EditText Phonenumber = ViewBindings.findChildViewById(rootView, id);
      if (Phonenumber == null) {
        break missingId;
      }

      id = R.id.Submit;
      Button Submit = ViewBindings.findChildViewById(rootView, id);
      if (Submit == null) {
        break missingId;
      }

      return new FragmentPayBinding((FrameLayout) rootView, Address, Emailaddress, Name,
          Phonenumber, Submit);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
