interface Document {
    void open();
}

class WordDocument implements Document {
    public void open() {
        System.out.println("Opening Word Document...");
    }
}

class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening PDF Document...");
    }
}

class ExcelDocument implements Document {
    public void open() {
        System.out.println("Opening Excel Document...");
    }
}

class DocumentFactory {
    public static Document createDocument(String type) {
        if (type.equals("word")) {
            return new WordDocument();
        } else if (type.equals("pdf")) {
            return new PdfDocument();
        } else if (type.equals("excel")) {
            return new ExcelDocument();
        } else {
            System.out.println("Unknown type");
            return null;
        }
    }
}

public class FactoryMethodPattern {
    public static void main(String[] args) {
        Document doc1 = DocumentFactory.createDocument("word");
        doc1.open();

        Document doc2 = DocumentFactory.createDocument("pdf");
        doc2.open();

        Document doc3 = DocumentFactory.createDocument("excel");
        doc3.open();
    }
}