package ru.netology.manager;

import ru.netology.domain.VKPost;

public class PostManager {
    private VKPost[] vkPosts;

    public void wallDelete(int ownerId, long id) {

    }

    public VKPost wallSearch(int ownerID, String query, int ownersOnly, int Count, int offset){
        return null;
    }

    public VKPost[] getVkPosts() {

        return this.vkPosts;
    }
}
