// Generated by view binder compiler. Do not edit!
package com.example.flatmatefinder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.flatmatefinder.R;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText PasswordInput;

  @NonNull
  public final TextView email;

  @NonNull
  public final TextView forgotPassword;

  @NonNull
  public final AppCompatButton googleLogin;

  @NonNull
  public final EditText inputEmail;

  @NonNull
  public final TextInputLayout inputPassword;

  @NonNull
  public final AppCompatButton logIn;

  @NonNull
  public final ImageView logo;

  @NonNull
  public final TextView nameHeading;

  @NonNull
  public final TextView or;

  @NonNull
  public final TextView password;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final TextView redirectSignUp;

  @NonNull
  public final View view1;

  @NonNull
  public final View view2;

  private FragmentLoginBinding(@NonNull ConstraintLayout rootView, @NonNull EditText PasswordInput,
      @NonNull TextView email, @NonNull TextView forgotPassword,
      @NonNull AppCompatButton googleLogin, @NonNull EditText inputEmail,
      @NonNull TextInputLayout inputPassword, @NonNull AppCompatButton logIn,
      @NonNull ImageView logo, @NonNull TextView nameHeading, @NonNull TextView or,
      @NonNull TextView password, @NonNull ProgressBar progressBar,
      @NonNull TextView redirectSignUp, @NonNull View view1, @NonNull View view2) {
    this.rootView = rootView;
    this.PasswordInput = PasswordInput;
    this.email = email;
    this.forgotPassword = forgotPassword;
    this.googleLogin = googleLogin;
    this.inputEmail = inputEmail;
    this.inputPassword = inputPassword;
    this.logIn = logIn;
    this.logo = logo;
    this.nameHeading = nameHeading;
    this.or = or;
    this.password = password;
    this.progressBar = progressBar;
    this.redirectSignUp = redirectSignUp;
    this.view1 = view1;
    this.view2 = view2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.PasswordInput;
      EditText PasswordInput = ViewBindings.findChildViewById(rootView, id);
      if (PasswordInput == null) {
        break missingId;
      }

      id = R.id.email;
      TextView email = ViewBindings.findChildViewById(rootView, id);
      if (email == null) {
        break missingId;
      }

      id = R.id.forgotPassword;
      TextView forgotPassword = ViewBindings.findChildViewById(rootView, id);
      if (forgotPassword == null) {
        break missingId;
      }

      id = R.id.googleLogin;
      AppCompatButton googleLogin = ViewBindings.findChildViewById(rootView, id);
      if (googleLogin == null) {
        break missingId;
      }

      id = R.id.inputEmail;
      EditText inputEmail = ViewBindings.findChildViewById(rootView, id);
      if (inputEmail == null) {
        break missingId;
      }

      id = R.id.inputPassword;
      TextInputLayout inputPassword = ViewBindings.findChildViewById(rootView, id);
      if (inputPassword == null) {
        break missingId;
      }

      id = R.id.logIn;
      AppCompatButton logIn = ViewBindings.findChildViewById(rootView, id);
      if (logIn == null) {
        break missingId;
      }

      id = R.id.logo;
      ImageView logo = ViewBindings.findChildViewById(rootView, id);
      if (logo == null) {
        break missingId;
      }

      id = R.id.nameHeading;
      TextView nameHeading = ViewBindings.findChildViewById(rootView, id);
      if (nameHeading == null) {
        break missingId;
      }

      id = R.id.or;
      TextView or = ViewBindings.findChildViewById(rootView, id);
      if (or == null) {
        break missingId;
      }

      id = R.id.password;
      TextView password = ViewBindings.findChildViewById(rootView, id);
      if (password == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.redirectSignUp;
      TextView redirectSignUp = ViewBindings.findChildViewById(rootView, id);
      if (redirectSignUp == null) {
        break missingId;
      }

      id = R.id.view1;
      View view1 = ViewBindings.findChildViewById(rootView, id);
      if (view1 == null) {
        break missingId;
      }

      id = R.id.view2;
      View view2 = ViewBindings.findChildViewById(rootView, id);
      if (view2 == null) {
        break missingId;
      }

      return new FragmentLoginBinding((ConstraintLayout) rootView, PasswordInput, email,
          forgotPassword, googleLogin, inputEmail, inputPassword, logIn, logo, nameHeading, or,
          password, progressBar, redirectSignUp, view1, view2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}