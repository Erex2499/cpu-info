/*
 * Copyright 2017 KG Soft
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.kgurgul.cpuinfo.testsuits.information

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.kgurgul.cpuinfo.R
import com.kgurgul.cpuinfo.core.BaseTestSuit
import com.kgurgul.cpuinfo.core.getString
import com.kgurgul.cpuinfo.pages.InfoContainerPage
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class InfoTestSuit : BaseTestSuit() {

    private val infoContainerPage = InfoContainerPage()

    @Test
    fun checkInfoTabs() {
        infoContainerPage.assertViewDisplayed()
            .assertToolbarTitle(getString(R.string.hardware))
            .tapTabWithTitle(getString(R.string.cpu))
            .assertHasAnyElements()
            .tapTabWithTitle(getString(R.string.gpu))
            .assertHasAnyElements()
            .tapTabWithTitle(getString(R.string.ram))
            .assertHasAnyElements()
            .tapTabWithTitle(getString(R.string.storage))
            .assertHasAnyElements()
            .tapTabWithTitle(getString(R.string.screen))
            .assertHasAnyElements()
            .tapTabWithTitle(getString(R.string.android))
            .assertHasAnyElements()
            .tapTabWithTitle(getString(R.string.hardware))
            .assertHasAnyElements()
            .tapTabWithTitle(getString(R.string.sensors))
            .assertHasAnyElements()
    }
}