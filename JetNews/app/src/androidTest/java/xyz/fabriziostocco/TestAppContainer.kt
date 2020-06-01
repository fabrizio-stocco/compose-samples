/*
 * Copyright 2019 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package xyz.fabriziostocco

import android.content.Context
import xyz.fabriziostocco.jetnews.data.AppContainer
import xyz.fabriziostocco.jetnews.data.interests.InterestsRepository
import xyz.fabriziostocco.jetnews.data.interests.impl.FakeInterestsRepository
import xyz.fabriziostocco.jetnews.data.posts.PostsRepository
import xyz.fabriziostocco.jetnews.data.posts.impl.BlockingFakePostsRepository

class TestAppContainer(private val context: Context) : AppContainer {

    override val postsRepository: PostsRepository by lazy {
        BlockingFakePostsRepository(context)
    }

    override val interestsRepository: InterestsRepository by lazy {
        FakeInterestsRepository()
    }
}
