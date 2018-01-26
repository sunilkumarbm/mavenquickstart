package com.sunnytech.mavenquickstart;

import org.apache.commons.lang3.StringUtils;

class Application {
	public int countWords(String sentence) {
		String words[] = StringUtils.split(sentence, " ");
		return words == null ? 0 : words.length;
	}

    public static void main(String ar[]) {
        System.out.println("Starting Application");
		Application app = new Application();

		int count = app.countWords("hello sunil. have a nice day");
		System.out.println("Count = " + count);
    }
}
