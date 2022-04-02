function solve() {
    class Post {
        constructor(title, content) {
            this.title = title;
            this.content = content;
        }

        toString() {
            return `Post: ${this.title}\nContent: ${this.content}\n`;

        }
    }

    class SocialMediaPost extends Post {
        constructor(title, content, likes, dislikes) {
            super(title, content);
            this.likes = likes;
            this.dislikes = dislikes;
            this.comments = [];
        }

        addComment(comment) {
            this.comments.push(comment);
        }


        toString() {
            if (this.comments.length != 0) {
                let comments = '';
                this.comments.forEach(x => comments += ('* ' + x + '\n'));
                return super.toString() + `Rating: ${this.likes - this.dislikes}\nComments: \n${comments}\n`;
            } else {
                return super.toString() + `Rating: ${this.likes - this.dislikes}\n`
            }

        }
    }

    class BlogPost extends Post {
        constructor(title, content, views) {
            super(title, content);
            this.views = views;
        }

        view() {
            return this.views++;
        }

        toString() {
            return super.toString() + `Views: ${this.views}\n`;
        }
    }
    return {Post, SocialMediaPost, BlogPost}
}


