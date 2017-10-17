package com.jsonqiu.bmvpdemo.network.entity;

import java.util.List;

/**
 * Created by JsonQiu on 2017/10/17 13:55.
 * JAVABean类————实体
 */

public class BookBean {
    @Override
    public String toString() {
        return "BookBean{" +
                "count=" + count +
                ", start=" + start +
                ", total=" + total +
                ", books=" + books +
                '}';
    }

    public int count;
    public int start;
    public int total;
    public List<BooksBean> books;

    public static class BooksBean {
        @Override
        public String toString() {
            return "BooksBean{" +
                    "rating=" + rating +
                    ", subtitle='" + subtitle + '\'' +
                    ", pubdate='" + pubdate + '\'' +
                    ", origin_title='" + origin_title + '\'' +
                    ", image='" + image + '\'' +
                    ", binding='" + binding + '\'' +
                    ", catalog='" + catalog + '\'' +
                    ", pages='" + pages + '\'' +
                    ", images=" + images +
                    ", alt='" + alt + '\'' +
                    ", id='" + id + '\'' +
                    ", publisher='" + publisher + '\'' +
                    ", isbn10='" + isbn10 + '\'' +
                    ", isbn13='" + isbn13 + '\'' +
                    ", title='" + title + '\'' +
                    ", url='" + url + '\'' +
                    ", alt_title='" + alt_title + '\'' +
                    ", author_intro='" + author_intro + '\'' +
                    ", summary='" + summary + '\'' +
                    ", series=" + series +
                    ", price='" + price + '\'' +
                    ", author=" + author +
                    ", tags=" + tags +
                    ", translator=" + translator +
                    '}';
        }

        public RatingBean rating;
        public String subtitle;
        public String pubdate;
        public String origin_title;
        public String image;
        public String binding;
        public String catalog;
        public String pages;
        public ImagesBean images;
        public String alt;
        public String id;
        public String publisher;
        public String isbn10;
        public String isbn13;
        public String title;
        public String url;
        public String alt_title;
        public String author_intro;
        public String summary;
        public SeriesBean series;
        public String price;
        public List<String> author;
        public List<TagsBean> tags;
        public List<?> translator;

        public static class RatingBean {
            @Override
            public String toString() {
                return "RatingBean{" +
                        "max=" + max +
                        ", numRaters=" + numRaters +
                        ", average='" + average + '\'' +
                        ", min=" + min +
                        '}';
            }

            public int max;
            public int numRaters;
            public String average;
            public int min;
        }

        public static class ImagesBean {
            @Override
            public String toString() {
                return "ImagesBean{" +
                        "small='" + small + '\'' +
                        ", large='" + large + '\'' +
                        ", medium='" + medium + '\'' +
                        '}';
            }

            public String small;
            public String large;
            public String medium;
        }

        public static class SeriesBean {
            @Override
            public String toString() {
                return "SeriesBean{" +
                        "id='" + id + '\'' +
                        ", title='" + title + '\'' +
                        '}';
            }

            public String id;
            public String title;
        }

        public static class TagsBean {
            @Override
            public String toString() {
                return "TagsBean{" +
                        "count=" + count +
                        ", name='" + name + '\'' +
                        ", title='" + title + '\'' +
                        '}';
            }

            public int count;
            public String name;
            public String title;
        }
    }
}
