package com.vasyl.practice;

import com.vasyl.practice.adapter.impl.XmlToJsonAdapter;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) throws Exception {
        XmlToJsonAdapter xmlToJsonAdapter = new XmlToJsonAdapter();

        String xml = """
                <bookstore>
                  <book category="fiction">
                    <title lang="en">The Great Gatsby</title>
                    <author>F. Scott Fitzgerald</author>
                    <year>1925</year>
                    <price>12.99</price>
                  </book>
                  <book category="non-fiction">
                    <title lang="en">Sapiens: A Brief History of Humankind</title>
                    <author>Yuval Noah Harari</author>
                    <year>2014</year>
                    <price>18.50</price>
                  </book>
                </bookstore>
                """;

        String json = xmlToJsonAdapter.adapt(xml);

        System.out.println(json);
    }
}
