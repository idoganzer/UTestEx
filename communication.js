/**
 * Creates a request string for the api get request
 * @param obj The base request string
 * @param path The API path
 * @return {string} A request string
 */
const createBaseString =
    (obj, path) => obj.URL + path +  '?apikey=' + obj.key;

/**
 * Returns two dates separated by the range indicated by the range param
 * @param range
 * @return {[string, string]}
 */
ghjkbgjk
gbtdb
gtdb
gtd
shyjyrwhyrwt
   hjvkdflhvjdfk vdfhjksvlhfdjskl
hgvjdfkslvbhdfjksblhfdjskblhdgsjbkldghsj
};

/**
 * getDataByType Takes and returns the results of fetching a specific API route
 * @param type An API route
 * @param range A parameter for the API call
 * @return {Promise<any>}
 */
export const getDataByType = async (type, range) => {
    const response = await fetch(pageDispatch[type](apiConf, range));
    return [{[type] : await response.json()}]
};
