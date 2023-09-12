# Task 3708
# Caching Proxy

An implementation of the Proxy pattern provides an object that controls access to another object.

You need to create a CachingProxyRetriever class in the retrievers package that will provide the same
same functionality as the OriginalRetriever class, but with one important addition. You must always try
first get the object from the cache, and only if it is not there - perform an expensive load operation from
storage. After receiving the necessary object from the storage, it must be cached
using an object of type LRUCache.

For the client (in this case the Solution class), using CachingProxyRetriever should be no different
from using the OriginalRetriever class.

P.S. You will need fields of types LRUCache and OriginalRetriever in the CachingProxyRetriever class.


## Requirements:
1. A field of type OriginalRetriever must be created in the CachingProxyRetriever class.
2. A field of type LRUCache must be created in the CachingProxyRetriever class.
3. The CachingProxyRetriever class constructor must take one parameter of the Storage type and initialize a field of the OriginalRetriever type.
4. The retrieve method of the CachingProxyRetriever class must search the cache for a suitable object using the find method.
5. The retrieve method of the CachingProxyRetriever class must retrieve an object from the store using the retrieve method of an object of type OriginalRetriever and add it to the cache if it was not found there.
6. The retrieve method of the CachingProxyRetriever class must not call the retrieve method of the OriginalRetriever class if the object was found in the cache.
7. The retrieve method of the CachingProxyRetriever class must return an object that corresponds to the id received as a parameter in the store.
8. The CachingProxyRetriever class must support the Retriever interface.