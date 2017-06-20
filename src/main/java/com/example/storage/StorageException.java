package com.example.storage;

/**
 * Created by Administrator on 2017/6/16 0016.
 */
public class StorageException extends RuntimeException {

    public StorageException(String message) {
        super(message);
    }

    public StorageException(String message, Throwable cause) {
        super(message, cause);
    }
}