package com.brianml31.instamoon.utils

import android.content.Context
import com.instagram.debug.devoptions.api.DeveloperOptionsLauncher
import com.instagram.mainactivity.InstagramMainActivity


class DeveloperUtils {
    companion object {
        fun openDeveloperMode(ctx: Context, instagramMainActivity: InstagramMainActivity) {
            DeveloperOptionsLauncher.INSTANCE.loadAndLaunchDeveloperOptions(ctx, instagramMainActivity, instagramMainActivity.A05)
        }
    }
}