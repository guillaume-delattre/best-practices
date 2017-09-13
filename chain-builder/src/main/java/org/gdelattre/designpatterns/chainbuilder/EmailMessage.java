package org.gdelattre.designpatterns.chainbuilder;

/**
 * An email message.
 */
public class EmailMessage {

    private String from;

    private String to;

    private String subject;

    private String content;

    private String mimeType;  // optional

    private EmailMessage() {}

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }

    public String getMimeType() {
        return mimeType;
    }

    public static Builder builder() {
        return new EmailMessage.Builder();
    }

    public static class Builder {
        private EmailMessage instance = new EmailMessage();

        private Builder() {
        }

        public Builder from(String from) {
            if (from == null) {
                throw new IllegalArgumentException("From parameter cannot be null");
            }
            instance.from = from;
            return this;
        }

        public Builder to(String to) {
            if (to == null) {
                throw new IllegalArgumentException("To parameter cannot be null");
            }
            instance.to = to;
            return this;
        }

        public Builder subject(String subject) {
            if (subject == null) {
                throw new IllegalArgumentException("Subject parameter cannot be null");
            }
            instance.subject = subject;
            return this;
        }

        public Builder content(String content) {
            if (content == null) {
                throw new IllegalArgumentException("Content parameter cannot be null");
            }
            instance.content = content;
            return this;
        }

        public Builder mimeType(String mimeTypeName) {
            instance.mimeType = mimeTypeName;
            return this;
        }

        public EmailMessage build() {
            return instance;
        }
    }
}
