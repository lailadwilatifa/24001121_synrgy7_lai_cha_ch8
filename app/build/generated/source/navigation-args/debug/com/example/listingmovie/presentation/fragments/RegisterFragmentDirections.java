package com.example.listingmovie.presentation.fragments;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.listingmovie.R;

public class RegisterFragmentDirections {
  private RegisterFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionRegisterFragmentToLoginFragment() {
    return new ActionOnlyNavDirections(R.id.action_registerFragment_to_loginFragment);
  }
}
